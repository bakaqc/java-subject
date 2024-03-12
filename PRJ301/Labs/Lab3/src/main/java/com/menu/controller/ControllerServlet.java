package com.menu.controller;

import com.menu.dao.ItemDAO;
import com.menu.model.Items;
import com.menu.model.MenuItems;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ControllerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

//      create multi-level menu
        List<Items> rawData = ItemDAO.getAllCategory();

        List<MenuItems> rootMenu = this.recursiveMenu(0, rawData);

        for (MenuItems menu : rootMenu) {
            for (MenuItems child : menu.getChild()) {
                System.out.println(child.getNameCategories() + child.getParentId());
                System.out.println(child.getChild().size());
            }
        }
        String menu = this.createMenu(rootMenu);
        System.out.println(menu);
        request.setAttribute("data", rawData);
        request.setAttribute("menu", menu);

//      create list items and paging
        int index = 1;
        try {
            String indexS = request.getParameter("index");
            index = Integer.parseInt(indexS);
        } catch (NumberFormatException ex) {
            index = 1;
        } catch (Exception ex) {
            index = 1;
        }

        List<Items> list = ItemDAO.pagingItem(3, (index - 1)*3);

        int count = ItemDAO.countAll();
        int endP = count / 3;
        if (count % 3 != 0) {
            endP++;
        }
        request.setAttribute("endP", endP);
        request.setAttribute("tag", index);
        request.setAttribute("listCAT", list);

        RequestDispatcher rd = request.getRequestDispatcher("/view/web.jsp");
        rd.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    public List<MenuItems> recursiveMenu(int root, List<Items> listData) {
        List<MenuItems> result = new ArrayList<>();
        for (int i = 0; i < listData.size(); i++) {
            Items cat1 = listData.get(i);
            int parentId = cat1.getParentId();
            System.out.println(cat1);
            if (root == parentId) {
                List<MenuItems> childs = this.recursiveMenu(cat1.getId(), listData);
                MenuItems mItem = new MenuItems();
                mItem.setId(cat1.getId());
                mItem.setNameCategories(cat1.getNameCategories());
                mItem.setParentId(cat1.getParentId());
                mItem.setChild(childs);
                result.add(mItem);
            }
        }
        return result;
    }

    public String createMenu(List<MenuItems> rootMenu) {
        String result = "<ul>";
        for (MenuItems item : rootMenu) {
            List<MenuItems> childs = item.getChild();
            if (childs.size() > 0) {
                result += "<li>";
                result += "<a href=''>" + item.getNameCategories() + "</a>";
                result += this.createMenu((List<MenuItems>) childs);
                result += "</li>";
            } else {
                result += "<li>";
                result += "<a href=''>" + item.getNameCategories() + "</a>";
                result += "</li>";
            }
        }
        result += "</ul>";

        return result;
    }

}
