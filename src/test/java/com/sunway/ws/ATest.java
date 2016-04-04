package com.sunway.ws;

import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class ATest {
	
	private static final Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
	
	public class Tt {
		private String aString;

		public String getaString() {
			return aString;
		}

		public void setaString(String aString) {
			this.aString = aString;
		}
	}
	
	public static void aaa(String... strings) {
		System.out.println(strings.length);
		System.out.println(strings == null);
		for (String string : strings) {
			System.out.println(string);
		}
		System.out.println(strings[1]);
	}
	
	public static int throwTest() {
		int a;
		try {
			a = 1/0;
		} catch (Exception e) {
			a = 2;
//			throw new RuntimeException();
		}
		return a;
	}
	
	public static void main(String[] args) {
		String aString = null;
		System.out.println("0".equals(aString));
		
		String json = "[{\"YEARMONTH\":\"201501\",\"CORPCODE\":1090,\"SHORTNAME\":\"炼化工程公司\",\"RATE_KPI\":0,\"RATE_AGREE\":null,\"RATE_AGREE_PO\":null,\"RATE_PO_ONLY\":null,\"RATE_BID\":null,\"RATE_FACTORY\":null,\"RATE_SAVED\":null,\"RATE_NET\":0,\"STOCKTYPE\":null,\"AMOUNT_AGREE\":null,\"AMOUNT_ALL\":0,\"AMOUNT_EC\":0,\"AMOUNT_1\":null,\"AMOUNT_2\":0,\"AMOUNT_AGREE_PO\":null,\"AMOUNT_ONLY\":0,\"AMOUNT_BID\":null,\"AMOUNT_FACTORY\":null,\"AMOUNT_SAVED\":null},{\"YEARMONTH\":\"201501\",\"CORPCODE\":7750,\"SHORTNAME\":\"四建公司\",\"RATE_KPI\":100,\"RATE_AGREE\":null,\"RATE_AGREE_PO\":null,\"RATE_PO_ONLY\":null,\"RATE_BID\":null,\"RATE_FACTORY\":null,\"RATE_SAVED\":null,\"RATE_NET\":100,\"STOCKTYPE\":null,\"AMOUNT_AGREE\":null,\"AMOUNT_ALL\":2217.15,\"AMOUNT_EC\":2217.16,\"AMOUNT_1\":null,\"AMOUNT_2\":2217.16,\"AMOUNT_AGREE_PO\":null,\"AMOUNT_ONLY\":0,\"AMOUNT_BID\":null,\"AMOUNT_FACTORY\":null,\"AMOUNT_SAVED\":null},{\"YEARMONTH\":\"201501\",\"CORPCODE\":7780,\"SHORTNAME\":\"五建公司\",\"RATE_KPI\":98,\"RATE_AGREE\":null,\"RATE_AGREE_PO\":null,\"RATE_PO_ONLY\":null,\"RATE_BID\":null,\"RATE_FACTORY\":null,\"RATE_SAVED\":null,\"RATE_NET\":99.6,\"STOCKTYPE\":null,\"AMOUNT_AGREE\":null,\"AMOUNT_ALL\":1108.58,\"AMOUNT_EC\":1104.12,\"AMOUNT_1\":null,\"AMOUNT_2\":1104.12,\"AMOUNT_AGREE_PO\":null,\"AMOUNT_ONLY\":0,\"AMOUNT_BID\":null,\"AMOUNT_FACTORY\":null,\"AMOUNT_SAVED\":null},{\"YEARMONTH\":\"201501\",\"CORPCODE\":7810,\"SHORTNAME\":\"十建公司\",\"RATE_KPI\":100,\"RATE_AGREE\":null,\"RATE_AGREE_PO\":null,\"RATE_PO_ONLY\":null,\"RATE_BID\":null,\"RATE_FACTORY\":null,\"RATE_SAVED\":null,\"RATE_NET\":100,\"STOCKTYPE\":null,\"AMOUNT_AGREE\":null,\"AMOUNT_ALL\":1191.24,\"AMOUNT_EC\":1191.24,\"AMOUNT_1\":null,\"AMOUNT_2\":1191.24,\"AMOUNT_AGREE_PO\":null,\"AMOUNT_ONLY\":0,\"AMOUNT_BID\":null,\"AMOUNT_FACTORY\":null,\"AMOUNT_SAVED\":null},{\"YEARMONTH\":\"201501\",\"CORPCODE\":7660,\"SHORTNAME\":\"工程建设公司\",\"RATE_KPI\":76,\"RATE_AGREE\":null,\"RATE_AGREE_PO\":null,\"RATE_PO_ONLY\":null,\"RATE_BID\":null,\"RATE_FACTORY\":null,\"RATE_SAVED\":null,\"RATE_NET\":63.09,\"STOCKTYPE\":null,\"AMOUNT_AGREE\":null,\"AMOUNT_ALL\":40314.05,\"AMOUNT_EC\":25435.74,\"AMOUNT_1\":null,\"AMOUNT_2\":25435.74,\"AMOUNT_AGREE_PO\":null,\"AMOUNT_ONLY\":0,\"AMOUNT_BID\":null,\"AMOUNT_FACTORY\":null,\"AMOUNT_SAVED\":null},{\"YEARMONTH\":\"201501\",\"CORPCODE\":8910,\"SHORTNAME\":\"上海工程公司\",\"RATE_KPI\":98,\"RATE_AGREE\":null,\"RATE_AGREE_PO\":null,\"RATE_PO_ONLY\":null,\"RATE_BID\":null,\"RATE_FACTORY\":null,\"RATE_SAVED\":null,\"RATE_NET\":100,\"STOCKTYPE\":null,\"AMOUNT_AGREE\":null,\"AMOUNT_ALL\":2555.49,\"AMOUNT_EC\":2555.5,\"AMOUNT_1\":null,\"AMOUNT_2\":2555.5,\"AMOUNT_AGREE_PO\":null,\"AMOUNT_ONLY\":0,\"AMOUNT_BID\":null,\"AMOUNT_FACTORY\":null,\"AMOUNT_SAVED\":null},{\"YEARMONTH\":\"201501\",\"CORPCODE\":8650,\"SHORTNAME\":\"洛阳工程公司\",\"RATE_KPI\":298,\"RATE_AGREE\":null,\"RATE_AGREE_PO\":null,\"RATE_PO_ONLY\":null,\"RATE_BID\":null,\"RATE_FACTORY\":null,\"RATE_SAVED\":null,\"RATE_NET\":761.43,\"STOCKTYPE\":null,\"AMOUNT_AGREE\":null,\"AMOUNT_ALL\":93.15,\"AMOUNT_EC\":709.27,\"AMOUNT_1\":null,\"AMOUNT_2\":709.27,\"AMOUNT_AGREE_PO\":null,\"AMOUNT_ONLY\":0,\"AMOUNT_BID\":null,\"AMOUNT_FACTORY\":null,\"AMOUNT_SAVED\":null},{\"YEARMONTH\":\"201501\",\"CORPCODE\":9300,\"SHORTNAME\":\"宁波工程公司\",\"RATE_KPI\":94,\"RATE_AGREE\":null,\"RATE_AGREE_PO\":null,\"RATE_PO_ONLY\":null,\"RATE_BID\":null,\"RATE_FACTORY\":null,\"RATE_SAVED\":null,\"RATE_NET\":100.17,\"STOCKTYPE\":null,\"AMOUNT_AGREE\":null,\"AMOUNT_ALL\":29604.3,\"AMOUNT_EC\":29655.05,\"AMOUNT_1\":null,\"AMOUNT_2\":29655.05,\"AMOUNT_AGREE_PO\":null,\"AMOUNT_ONLY\":0,\"AMOUNT_BID\":null,\"AMOUNT_FACTORY\":null,\"AMOUNT_SAVED\":null},{\"YEARMONTH\":\"201501\",\"CORPCODE\":7690,\"SHORTNAME\":\"南京工程公司\",\"RATE_KPI\":97,\"RATE_AGREE\":null,\"RATE_AGREE_PO\":null,\"RATE_PO_ONLY\":null,\"RATE_BID\":null,\"RATE_FACTORY\":null,\"RATE_SAVED\":null,\"RATE_NET\":100.15,\"STOCKTYPE\":null,\"AMOUNT_AGREE\":null,\"AMOUNT_ALL\":2247.97,\"AMOUNT_EC\":2251.27,\"AMOUNT_1\":null,\"AMOUNT_2\":2242.49,\"AMOUNT_AGREE_PO\":null,\"AMOUNT_ONLY\":0,\"AMOUNT_BID\":null,\"AMOUNT_FACTORY\":null,\"AMOUNT_SAVED\":null}]";
		
		Type type = new TypeToken<ArrayList<KhBean>>() {}.getType(); 
		System.out.println(gson.fromJson(json, type));
		
	}

}
