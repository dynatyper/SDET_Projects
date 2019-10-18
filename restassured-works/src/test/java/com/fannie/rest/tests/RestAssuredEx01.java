package com.fannie.rest.tests;

import static org.hamcrest.Matchers.*;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class RestAssuredEx01 {

	// @Test
	// public void testStatusCode(){
	// given()
	// .get("https://jsonplaceholder.typicode.com/posts")
	// .then()
	// .statusCode(200);
	// }

	// @Test
	public void testToGetResponseData() {
		given().get("https://jsonplaceholder.typicode.com/posts").then().statusCode(200).log().all();
	}

	// @Test
	public void testEqualToFunctionValueOfTitle() {

		String returnText = "sunt aut facere repellat provident occaecati excepturi optio reprehenderit";
		given().get("https://jsonplaceholder.typicode.com/posts/1").then().body("title", equalTo(returnText));
	}

	// @Test
	public void testHasItemForEmailInComment() {

		given().get("https://jsonplaceholder.typicode.com/posts/1/comments").then().body("email",
				hasItems("Eliseo@gardner.biz", "Nikita@garfield.biz", "Presley.Mueller@myrl.com"));
	}

	// @Test
	public void testQueryParam() {
		// https://jsonplaceholder.typicode.com/comments?postId=1

		given().queryParam("postId", 1).when().get("https://jsonplaceholder.typicode.com/comments").then()
				.statusCode(200).log().all();
	}

	// @Test
	public void testXmlData() {
		String path = "http://www.thomas-bayer.com/sqlrest/CUSTOMER/10";
		String expectedName = "Sue";

		given().get(path).then().body("CUSTOMER.FIRSTNAME", equalTo(expectedName)).statusCode(200).log().all();

	}

	// @Test
	public void testXmlDataTestWithHasXml() {
		String path = "http://www.thomas-bayer.com/sqlrest/CUSTOMER/10";
		String expectedName = "Sue";

		given().get(path).then().body(hasXPath("/CUSTOMER/FIRSTNAME"), equalTo(expectedName)).statusCode(200).log()
				.all();

	}

	// @Test
	public void testAuthorizationFailedCase() {
		String path = "http://ecommerceapiservices.herokuapp.com/v1/account";

		given().get(path).then().body("email", equalTo("test@testing.com"));
	}

	// @Test
	public void testAuthorizationFailedPassCase() {
		String path = "http://ecommerceapiservices.herokuapp.com/v1/account";

		given().get(path).then().body("statusCode", equalTo(401)).body("error", equalTo("Unauthorized"));
	}

//	@Test
	public void testWithAuthCartId() {
		String path = "http://ecommerceapiservices.herokuapp.com/v1/account/";
		String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6ImU1N2U5YmNjLTg4MWMtNDRlMy04MzJiLWQzZGU4MTU3Njg0NCIsImlhdCI6MTU3MTQxNjA3OX0.MM2t0udKRt4F1KuN8H7EPMoq2NA7YXxrfzX5e_fmgfo";

		given()
			.header("Authorization", "Bearer " + token)
		.when()
			.get(path)
		.then()
			.body("carts[0].id", is("fee92538-4e0e-4a6c-8860-68c22ff5bc13"))
			.body("carts[0].createdAt", is("2019-10-18T17:55:16.502Z"))
			.statusCode(200)
			.log()
			.all();

	}

//	@Test
	public void testWithAuthCartIdWithRoot() {
		String path = "http://ecommerceapiservices.herokuapp.com/v1/account/";
		String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6ImU1N2U5YmNjLTg4MWMtNDRlMy04MzJiLWQzZGU4MTU3Njg0NCIsImlhdCI6MTU3MTQxNjA3OX0.MM2t0udKRt4F1KuN8H7EPMoq2NA7YXxrfzX5e_fmgfo";

		given()
			.header("Authorization", "Bearer " + token)
		.when()
			.get(path)
		.then()
			.root("carts[0]")
			.body("id", is("fee92538-4e0e-4a6c-8860-68c22ff5bc13"))
			.body("createdAt", is("2019-10-18T17:55:16.502Z"))
			.statusCode(200)
			.log()
			.all();

	}
	
	@Test
	public void testWithAuthCartIdWithRootDetachAndAttach() {
		String path = "http://ecommerceapiservices.herokuapp.com/v1/account/";
		String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6ImU1N2U5YmNjLTg4MWMtNDRlMy04MzJiLWQzZGU4MTU3Njg0NCIsImlhdCI6MTU3MTQxNjA3OX0.MM2t0udKRt4F1KuN8H7EPMoq2NA7YXxrfzX5e_fmgfo";

		given()
			.header("Authorization", "Bearer " + token)
		.when()
			.get(path)
		.then()
			.root("carts[0]")
			.body("id", is("fee92538-4e0e-4a6c-8860-68c22ff5bc13"))
			.body("createdAt", is("2019-10-18T17:55:16.502Z"))
			.detachRoot("carts[0]")
			.root("carts[1]")
			.body("id", is("6115137a-e162-4b50-91b0-223ac4726d7d"))
			.body("createdAt", is("2019-10-18T17:54:54.221Z"))
			.statusCode(200)
			.log()
			.all();

	}
	
}
