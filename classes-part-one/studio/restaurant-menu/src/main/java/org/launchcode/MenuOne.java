package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class MenuOne {
    private Date lastUpdated;
    private ArrayList<MenuItemOne> items;

    public MenuOne (Date lastUpdated, ArrayList<MenuItemOne> items) {
        this.lastUpdated=lastUpdated;
        this.items=items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    protected void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItemOne> getItems() {
        return items;
    }

    protected void setItems(ArrayList<MenuItemOne> items) {
        this.items = items;
    }
}
