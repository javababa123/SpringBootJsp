package com.rrl;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rrl.model.Item;
import com.rrl.model.Shipment;
import com.rrl.service.ItemService;
import com.rrl.service.ShipmentService;


@RestController
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	  @Autowired
	  @Qualifier("ItemServiceImpl")   
	 ItemService itemService;
	
	
	 @Autowired
	  @Qualifier("ShipmentServiceImpl")   
	 ShipmentService shipmentService;
	
	 
	  @RequestMapping(value = "/items", method = RequestMethod.GET)
	public String getItemInfo(Map<String, Object> model) {
		System.out.println("get items method1");		  
		//return itemService.getItemInfo();
		//return "{\"itemKey\":1111111113,\"itemID\":\"1000000003\",\"itemName\":\"LGTV\",\"itemDesc\":\"LG Flatron TV\",\"modifyts\":\"2018-03-08 00:00:00\",\"creates\":\"07-MAR-18\"}";
		//return "[\"1111111113\",\"1000000003\",\"LGTV\",\"LG Flatron TV\",\"2018-03-08 00:00:00\",\"07-MAR-18\"]";
//	   return "[{\"createdBy\": \"Laxmi\",\"createdAt\": 1521530456000,\"modifiedBy\": \"Laxmi\",\"modifiedAt\": 1521530456000,\"articleKey\": \"20180320125056681170\",\"articleCode\": \"491297355\",\"articleType\": \"PHY\",\"tenantId\": \"DIGI\",\"articleDesc\": \"Google Pixel XL Smart Phone 32 GB\",\" Quite Black\",\"serialCount\": 0,\"height\": 4.47,\"length\": 17.55,\"width\": 15,\"dimensionUom\": \"cm\",\"weight\": 547,\"weightUom\": \"GRAM\",\"volume\": 1176.72,\"volumeUom\": \"cc\",\"hsnsacCode\": \"851770\",\"aliasList\": [{createdBy\": \"Laxmi\",\"createdAt\": 1521530456000,\"modifiedBy\": \"Laxmi\",\"modifiedAt\": 1521530456000,\"aliasKey\": \"20180320125056748171\",\"aliasType\": \"EAN\",\"aliasVal\": \"1000000009894\"},\"{createdBy\": \"Laxmi\",\"createdAt\": 1521530456000,\"modifiedBy\": \"Laxmi\",\"modifiedAt\": 1521530456000,\"aliasKey\": \"20180320125056789172\",\"aliasType\": \"EAN\",\"aliasVal\": \"1000000009895\"}]}]";
	   //return "[{\"createdBy\": \"Laxmi\",\"createdAt\": 1521530456000,\"modifiedBy\": \"Laxmi\",\"modifiedAt\": 1521530456000,\"articleKey\": \"20180320125056681170\",\"articleCode\": \"491297355\",\"articleType\": \"PHY\",\"tenantId\": \"DIGI\",\"articleDesc\": \"Google Pixel XL Smart Phone 32 GB Quite Black\",\"serialCount\": 0,\"height\": 4.47,\"length\": 17.55,\"width\": 15,\"dimensionUom\": \"cm\",\"weight\": 547,\"weightUom\": \"GRAM\",\"volume\": 1176.72,\"volumeUom\": \"cc\",\"hsnsacCode\": \"851770\",\"aliasList\": [{\"createdBy\": \"Laxmi\",\"createdAt\": 1521530456000,\"modifiedBy\": \"Laxmi\",\"modifiedAt\": 1521530456000,\"aliasKey\": \"20180320125056748171\",\"aliasType\": \"EAN\",\"aliasVal\": \"1000000009894\"},{\"createdBy\": \"Laxmi\",\"createdAt\": 1521530456000,\"modifiedBy\": \"Laxmi\",\"modifiedAt\": 1521530456000,\"aliasKey\": \"20180320125056789172\",\"aliasType\": \"EAN\",\"aliasVal\": \"1000000009895\"}]},{\"createdBy\": \"Laxmi\",\"createdAt\": 1521530595000,\"modifiedBy\": \"Laxmi\",\"modifiedAt\": 1521530595000,\"articleKey\": \"20180320125315829173\",\"articleCode\": \"491297356\",\"articleType\": \"PHY\",\"tenantId\": \"DIGI\",\"articleDesc\": \"Canon EOS 700D DSLR Camera with 18-135 mm Lens Kit\",\"serialCount\": 0,\"height\": 5.47,\"length\": 19.55,\"width\": 15,\"dimensionUom\": \"cm\",\"weight\": 547,\"weightUom\": \"GRAM\",\"volume\": 1176.72,\"volumeUom\": \"cc\",\"hsnsacCode\": \"851712\",\"aliasList\": [{\"createdBy\": \"Laxmi\",\"createdAt\": 1521530595000,\"modifiedBy\": \"Laxmi\",\"modifiedAt\": 1521530595000,\"aliasKey\": \"20180320125315856174\",\"aliasType\": \"EAN\",\"aliasVal\": \"1000000009890\"},{\"createdBy\": \"Laxmi\",\"createdAt\": 1521530595000,\"modifiedBy\": \"Laxmi\",\"modifiedAt\": 1521530595000,\"aliasKey\": \"20180320125315883175\",\"aliasType\": \"EAN\",\"aliasVal\": \"1000000009891\"}]},{\"createdBy\": \"Laxmi\",\"createdAt\": 1521531015000,\"modifiedBy\": \"Laxmi\",\"modifiedAt\": 1521531015000,\"articleKey\": \"20180320130015281179\",\"articleCode\": \"491297357\",\"articleType\": \"PHY\",\"tenantId\": \"DIGI\",\"articleDesc\": \"Apple iPhone 7 Plus 128 GB ROSE GOLD 12\",\"serialCount\": 0,\"height\": 5.47,\"length\": 19.55,\"width\": 15,\"dimensionUom\": \"cm\",\"weight\": 547,\"weightUom\": \"GRAM\",\"volume\": 1176.72,\"volumeUom\": \"cc\",\"hsnsacCode\": \"851712\",\"aliasList\": [{\"createdBy\": \"Laxmi\",\"createdAt\": 1521531015000,\"modifiedBy\": \"Laxmi\",\"modifiedAt\": 1521531015000,\"aliasKey\": \"20180320130015335180\",\"aliasType\": \"EAN\",\"aliasVal\": \"1000000009880\"}]}]";
		return "[{\"createdBy\": \"Laxmi\",\"createdAt\": 1521530456000,\"modifiedBy\": \"Laxmi\",\"modifiedAt\": 1521530456000,\"articleKey\": \"20180320125056681170\",\"articleCode\": \"491297355\",\"articleType\": \"PHY\",\"tenantId\": \"DIGI\",\"articleDesc\": \"Google Pixel XL Smart Phone 32 GB Quite Black\",\"serialCount\": 0,\"height\": 4.47,\"length\": 17.55,\"width\": 15,\"dimensionUom\": \"cm\",\"weight\": 547,\"weightUom\": \"GRAM\",\"volume\": 1176.72,\"volumeUom\": \"cc\",\"hsnsacCode\": \"851770\",\"aliasList\": [{\"createdBy\": \"Laxmi\",\"createdAt\": 1521530456000,\"modifiedBy\": \"Laxmi\",\"modifiedAt\": 1521530456000,\"aliasKey\": \"20180320125056748171\",\"aliasType\": \"EAN\",\"aliasVal\": \"1000000009894\"},{\"createdBy\": \"Laxmi\",\"createdAt\": 1521530456000,\"modifiedBy\": \"Laxmi\",\"modifiedAt\": 1521530456000,\"aliasKey\": \"20180320125056789172\",\"aliasType\": \"EAN\",\"aliasVal\": \"1000000009895\"}],\"inventoryData\": [{\"value\": 300,\"color\":\"#F7464A\",\"highlight\": \"#FF5A5E\",\"label\": \"Staging\"},{\"value\": 50,\"color\": \"#46BFBD\",\"highlight\": \"#5AD3D1\",\"label\": \"Reserved\"},{\"value\": 100,\"color\": \"#FDB45C\",\"highlight\": \"#FFC870\", \"label\": \"Open\"}]},{\"createdBy\": \"Laxmi\",\"createdAt\": 1521530595000,\"modifiedBy\": \"Laxmi\",\"modifiedAt\": 1521530595000,\"articleKey\": \"20180320125315829173\",\"articleCode\": \"491297356\",\"articleType\": \"PHY\",\"tenantId\": \"DIGI\",\"articleDesc\": \"Canon EOS 700D DSLR Camera with 18-135 mm Lens Kit\",\"serialCount\": 0,\"height\": 5.47,\"length\": 19.55,\"width\": 15,\"dimensionUom\": \"cm\",\"weight\": 547,\"weightUom\": \"GRAM\",\"volume\": 1176.72,\"volumeUom\": \"cc\",\"hsnsacCode\": \"851712\",\"aliasList\": [{\"createdBy\": \"Laxmi\",\"createdAt\": 1521530595000,\"modifiedBy\": \"Laxmi\",\"modifiedAt\": 1521530595000,\"aliasKey\": \"20180320125315856174\",\"aliasType\": \"EAN\",\"aliasVal\": \"1000000009890\"},{\"createdBy\": \"Laxmi\",\"createdAt\": 1521530595000,\"modifiedBy\": \"Laxmi\",\"modifiedAt\": 1521530595000,\"aliasKey\": \"20180320125315883175\",\"aliasType\": \"EAN\",\"aliasVal\": \"1000000009891\"}],\"inventoryData\": [{\"value\": 100,\"color\":\"#F7464A\",\"highlight\": \"#FF5A5E\",\"label\": \"Staging\"},{\"value\": 150,\"color\": \"#46BFBD\",\"highlight\": \"#5AD3D1\",\"label\": \"Reserved\"},{\"value\": 110,\"color\": \"#FDB45C\",\"highlight\": \"#FFC870\", \"label\": \"Open\"}]},{\"createdBy\": \"Laxmi\",\"createdAt\": 1521531015000,\"modifiedBy\": \"Laxmi\",\"modifiedAt\": 1521531015000,\"articleKey\": \"20180320130015281179\",\"articleCode\": \"491297357\",\"articleType\": \"PHY\",\"tenantId\": \"DIGI\",\"articleDesc\": \"Apple iPhone 7 Plus 128 GB ROSE GOLD 12\",\"serialCount\": 0,\"height\": 5.47,\"length\": 19.55,\"width\": 15,\"dimensionUom\": \"cm\",\"weight\": 547,\"weightUom\": \"GRAM\",\"volume\": 1176.72,\"volumeUom\": \"cc\",\"hsnsacCode\": \"851712\",\"aliasList\": [{\"createdBy\": \"Laxmi\",\"createdAt\": 1521531015000,\"modifiedBy\": \"Laxmi\",\"modifiedAt\": 1521531015000,\"aliasKey\": \"20180320130015335180\",\"aliasType\": \"EAN\",\"aliasVal\": \"1000000009880\"}],\"inventoryData\": [{\"value\": 130,\"color\":\"#F7464A\",\"highlight\": \"#FF5A5E\",\"label\": \"Staging\"},{\"value\": 90,\"color\": \"#46BFBD\",\"highlight\": \"#5AD3D1\",\"label\": \"Reserved\"},{\"value\": 70,\"color\": \"#FDB45C\",\"highlight\": \"#FFC870\", \"label\": \"Open\"}]}]";

	  }
	   @RequestMapping(value = "/item/{id}", method = RequestMethod.GET)
	    public List<Item> getItemById(@PathVariable("id") String id){
		   System.out.println("Id:"+id);
	        return itemService.getItemById(id);
	    }
	   @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	    public String setItemInfo(@RequestBody Item item){
		   System.out.println("Insertion process");
		return itemService.setItemInfo(item)==true?"Data inserted succesfully": "Failure while inserting";
	    }
	   
	   @RequestMapping(value = "/shipments", method = RequestMethod.GET)
		public String getShipmentList(Map<String, Object> model) {
		   System.out.println("get shipments method");		  
		   //return shipmentService.getShipmentInfo();
		   return "[{\"createdBy\": \"Laxmi\",\"createdAt\": 1521457633000,\"modifiedBy\": \"Laxmi\",\"modifiedAt\": 1521457633000,\"shipmentKey\": \"20180319163713843151\",\"shipmentNo\": \"DI100006517\",\"tenantId\": \"DIGI\",\"dcCode\": \"V028\",\"shipmentType\": \"FWD\",\"scac\": \"ECOM\",\"orderNo\": \"RDF00295008\",\"awbNo\": \"1234567890\",\"containerScm\": null,\"containerType\": null,\"manifestNo\": null,\"status\": \"Created\",\"totalAmount\": 1080.5,\"paymentType\": \"COD\",\"ewaybillNo\": null,\"addressLine1\": \"btm 1st stage\",\"addressLine2\": \"jay bheema nagar\",\"addressLine3\": null,\"addressLine4\": null,\"city\": \"Bangalore\",\"state\": \"KAR\",\"zipCode\": \"560076\",\"country\": \"IN\",\"shipmentLineList\": [{\"createdBy\": \"Laxmi\",\"createdAt\": 1521457633000,\"modifiedBy\": \"Laxmi\",\"modifiedAt\": 1521457633000,\"shipmentLineKey\": \"20180319163713984152\",\"articleCode\": \"491297355\",\"quantity\": 2,\"packedQuantity\": 0,\"lineNo\": 1},{\"createdBy\": \"Laxmi\",\"createdAt\": 1521457634000,\"modifiedBy\": \"Laxmi\",\"modifiedAt\": 1521457634000,\"shipmentLineKey\": \"20180319163714008153\",\"articleCode\": \"491297355\",\"quantity\": 2,\"packedQuantity\": 0,\"lineNo\": 2}]},"
				+ "{\"createdBy\": \"Laxmi\",\"createdAt\": 1521457633000,\"modifiedBy\": \"Laxmi\",\"modifiedAt\": 1521457633000,\"shipmentKey\": \"20180319163713843152\",\"shipmentNo\": \"DI100006518\",\"tenantId\": \"JIO\",\"dcCode\": \"V028\",\"shipmentType\": \"FWD\",\"scac\": \"ECOM\",\"orderNo\": \"RDF00295009\",\"awbNo\": \"1234567891\",\"containerScm\": null,\"containerType\": null,\"manifestNo\": null,\"status\": \"Created\",\"totalAmount\": 1180.5,\"paymentType\": \"NONCOD\",\"ewaybillNo\": null,\"addressLine1\": \"btm 2nd stage\",\"addressLine2\": \"jay bheema nagar\",\"addressLine3\": null,\"addressLine4\": null,\"city\": \"Bangalore\",\"state\": \"KAR\",\"zipCode\": \"560036\",\"country\": \"IN\",\"shipmentLineList\": [{\"createdBy\": \"Laxmi\",\"createdAt\": 1521457633000,\"modifiedBy\": \"Laxmi\",\"modifiedAt\": 1521457633000,\"shipmentLineKey\": \"20180319163713984152\",\"articleCode\": \"491297356\",\"quantity\": 2,\"packedQuantity\": 1,\"lineNo\": 1},{\"createdBy\": \"Laxmi\",\"createdAt\": 1521457634000,\"modifiedBy\": \"Laxmi\",\"modifiedAt\": 1521457634000,\"shipmentLineKey\": \"20180319163714008153\",\"articleCode\": \"491297355\",\"quantity\": 2,\"packedQuantity\": 0,\"lineNo\": 2}]}]";
		  }
	   @RequestMapping(value = "/getDashboard", method = RequestMethod.GET)
		public String getDashboard() {
		   System.out.println("getDashboard method");
		//   return "[{\"filledPigeonHole\":\"30\",\"totalPigeonHole\":\"50\",\"sortedShipment\":\"22\",\"packedShipment\":\"33\",\"userList\":\"13\",\"dailyOrders\": [[12, 17, 7, 17, 23, 18, 38]],\"monthlyOrders\":[[542, 443, 320, 780, 553, 453, 326, 434, 568, 610, 756, 895]],\"efficiency\"\"[[230, 750, 450, 300, 280, 240, 200, 190],[130, 350, 550, 700, 580, 440, 760, 690]]}]";
		   return "[{\"filledPigeonHole\":\"30\",\"totalPigeonHole\":\"50\",\"sortedShipment\":\"22\",\"packedShipment\":\"33\",\"userList\":\"13\",\"dailySalesChart\":{\"labels\": [\"M\", \"T\", \"W\", \"T\", \"F\", \"S\", \"S\"],\"series\": [[10, 10, 10, 17, 23, 18, 38]]},\"monthlySalesChart\":{\"labels\": [\"Jan\",\"Feb\",\"Mar\",\"Apr\",\"Mai\",\"Jun\",\"Jul\",\"Aug\",\"Sep\",\"Oct\",\"Nov\",\"Dec\"],\"series\": [[700, 700, 700, 780, 553, 453, 326, 434, 568, 610, 756, 895]]},\"efficiencyCharts\":{\"labels\": [\"12am\", \"3pm\", \"6pm\", \"9pm\", \"12pm\", \"3am\", \"6am\", \"9am\"],\"series\": [[200, 200, 200, 300, 280, 240, 200, 190],[130, 350, 550, 700, 580, 440, 760, 690]]},\"employeeList\":[[\"10001\", \"Rice\", \"Sorting\", \"09:00\",\"18:30\"],[\"10002\", \"Ram\", \"Sorting\", \"09:00\",\"18:30\"],[\"10003\", \"Prakash\", \"Packing\", \"09:00\",\"18:30\"]]}]";
			  
	   }
	   	   
	   
	   @RequestMapping(value = "/shipment/{id}" ,method = RequestMethod.GET)
	 		public List<Shipment> getShipmentList(@PathVariable("id") String id) {
		   System.out.println("get shipment with id method");		  
		   	return shipmentService.getShipmentByShipmentNo(id);	
	 		  }
	  
	   @RequestMapping(value = "/getSortDetail/{olskey}", method = RequestMethod.GET)
		public String getSortDetail(@PathVariable("olskey") String id) {
		   System.out.println("getSortDetail method");
		   if("123".equals(id))
			   return "[{\"OlsKey\":\"1111111113\",\"ItemID\":\"1000000003\",\"Qty\":\"2.00\",\"Location\":\"V028-001-02-03\"}]";
		   else
			   return "[]";
		  }
	   
	   @RequestMapping(value = "/getPackDetail/{olskey}", method = RequestMethod.GET)
		public String getPackDetail(@PathVariable("olskey") String id) {
		   System.out.println("getPackDetail method");		  
		   if("123".equals(id))	
			   return "[{\"OlsKey\":\"1111111113\",\"ShipmentNo\":\"1000000003\",\"ItemID\":\"123000003\",\"ItemDesc\":\"iPhone X\",\"Qty\":\"2.00\",\"OrderNo\":\"100986622\"}]";
		   else
			   return "[]";
		  }
	   @RequestMapping(value = "/login/{username}/{password}", method = RequestMethod.GET)
		public String getLogin(@PathVariable("username") String name,@PathVariable("password") String pass) {
		   System.out.println("login method");		 
		   
		   if(name.equals("admin") && pass.equals("password"))
		   {
		   Date date = new Date();
		   long timeMilli = date.getTime();
		   Calendar calendar = Calendar.getInstance();
		   long timeMilli2 = calendar.getTimeInMillis();
		   return "[{\"stoken\":"+ZonedDateTime.now().toInstant().toEpochMilli()+",\"valid\":true}]";
		   }else{
			return   "[{\"stoken\":\"0\",\"valid\":false}]";   
		   }
		   }
}