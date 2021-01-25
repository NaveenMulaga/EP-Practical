package com.market.Bean;

public class Bean {
 private static int itemid;
 private static String itemname;
 private static float costofitem;
public static int getItemid() {
	return itemid;
}
public static void setItemid(int itemid) {
	Bean.itemid = itemid;
}
public static String getItemname() {
	return itemname;
}
public static void setItemname(String itemname) {
	Bean.itemname = itemname;
}
public static float getCostofitem() {
	return costofitem;
}
public static void setCostofitem(float costofitem) {
	Bean.costofitem = costofitem;
}


}
