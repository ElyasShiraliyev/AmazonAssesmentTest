package Test;

import Page.*;
import Utility.Base;
import org.testng.annotations.Test;

public class E2EAmazon extends Base {

    HomePage home = new HomePage();
    ListOfItemsPage listItems = new ListOfItemsPage();
    ItemPage item = new ItemPage();
    CheckOutPage checkOut = new CheckOutPage();

    static String actPrice = "";
    static String exPrice = "$47.49";

    @Test
    public void InputSuccess() {

        home.searchItem();
        listItems.itemList();
        item.itemCard(exPrice);
        checkOut.itemCheckOut(exPrice);
    }
}