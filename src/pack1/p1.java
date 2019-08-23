package pack1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class p1 {
  @Test
  public void f() 
  {
	  RestAssured.baseURI= "https://reqres.in/";
	  Response res=RestAssured.given().when().get("/api/users?page=2").then().extract().response();
	  System.out.println(res.asString());
	  
	  JsonPath js=new JsonPath(res.asString());
	  String data=js.get("data".toString());
	  System.out.println(data);
	}
}

