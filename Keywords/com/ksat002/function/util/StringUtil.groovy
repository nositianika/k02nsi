package com.ksat002.function.util

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class StringUtil {

	@Keyword
	public static String randomString(String chars, int length) {
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<length; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return sb.toString();
	}

	@Keyword
	def static String getRandomEmail(int length) {
		String chars = 'abcdefghijklmnABCDEFGHIJKLMNOPQRSTUVWXYZ123456789';
		return randomString(chars, length) + '@email.com';
	}

	@Keyword
	def static String getRandomEmail(){
		String chars = 'abcdefghijklmnABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890';
		return randomString(chars, 10) + '@email.com';
	}

	@Keyword
	def String getrandomPhoneNumber (int length) {
		String number = '1234567890';
		return '08' +randomString(number, length);
	}

	@Keyword
	def String getrandomPhoneNumber() {
		String number = '1234567890';
		return '08' +randomString(number,9);
	}
}

