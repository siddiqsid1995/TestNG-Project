package org.base;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static Actions a;

	public static void launchBrowser() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

	}

	public static void passUrl(String url) {

		driver.get(url);
	}

	public static void toInput(WebElement element, String input) {

		element.sendKeys(input);
	}

	public static void btnClick(WebElement element) {

		element.click();

	}

	public static void maxBrowser() {

		driver.manage().window().maximize();
	}

	public static void closeBrowser() {

		driver.quit();
	}

	public static void printText(WebElement element) {

		System.out.println(element.getText());
	}
	public static String toGetUserInput(WebElement element) {

		String attribute = element.getAttribute("value");
		
		return attribute;
		
	}

	public static void printUrl() {

		System.out.println(driver.getCurrentUrl());
	}

	public static void printTitle() {

		System.out.println(driver.getTitle());
	}

	public static void toPerformMouseHoverAction(WebElement element) {

		a = new Actions(driver);

		a.moveToElement(element).perform();

	}

	public static void toPerformDragAndDrop(WebElement src, WebElement dest) {

		a.dragAndDrop(src, dest).perform();
	}

	public static void toPerformEnter() throws AWTException {

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static String excelRead(int row, int cell) throws IOException {

		File file = new File("C:\\Users\\Greens\\eclipse-workspace\\Framework3.00Pm\\data\\data321.xlsx");

		FileInputStream f = new FileInputStream(file);

		Workbook w = new XSSFWorkbook(f);

		Sheet s = w.getSheet("Sheet1");

		Row r = s.getRow(row);

		Cell c = r.getCell(cell);

		int cellType = c.getCellType();

		String value;

		if (cellType == 1) {
			value = c.getStringCellValue();

		} else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();

			SimpleDateFormat s1 = new SimpleDateFormat("dd-MMM-yyyy");

			value = s1.format(d);
		} else {

			double dd = c.getNumericCellValue();

			long l = (long) dd;

			value = String.valueOf(l);

		}
		return value;

	}

}
