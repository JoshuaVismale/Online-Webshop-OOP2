package web.DAO;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import web.entitites.ProductBean;

public class ProductDao 
{	
	static Connection currentCon = null;
	
	public static List<ProductBean> find(String name)
	{
		List<ProductBean> List = new ArrayList<>();
		String Query = "select productName, productPrice, productDetails, productImage from product where productName='"+ name +"'";
		Statement stmt =null;
		InputStream inputStream = null;
		ByteArrayOutputStream outputStream = null;
		
		try 
		{
			currentCon = DbConnection.getConnection();
	        stmt=currentCon.createStatement();
	        ResultSet result = stmt.executeQuery(Query);
	        
	        while (result.next()) 
			{
				  ProductBean phone = new ProductBean();
				  phone.setProductName(result.getString("productName"));
				  phone.setProductPrice(result.getFloat("productPrice"));
				  phone.setProductDetails(result.getString("productDetails"));					  
				  
				  Blob blob = result.getBlob("ProductImage");
				    	
				  inputStream = blob.getBinaryStream();
			      outputStream = new ByteArrayOutputStream();
			      byte[] buffer = new byte[4096];
			      int bytesRead = -1;
			             
			      while ((bytesRead = inputStream.read(buffer)) != -1) 
			      {
			           outputStream.write(buffer, 0, bytesRead);                  
			      }
			             
			      byte[] imageBytes = outputStream.toByteArray();
			      String base64Image = Base64.getEncoder().encodeToString(imageBytes);
			            
			      phone.setBase64image(base64Image);				  
			      List.add(phone);
			 }
	        
	        inputStream.close();
	        outputStream.close();  
	        currentCon.close();
		  }
	   
		catch (SQLException | IOException ex) 
		{
			ex.printStackTrace();
		} 
		
		return List;
	}
	
	public static List<ProductBean> findAllPhones()
	{
		List<ProductBean> phoneList = new ArrayList<>();
		String selectQuery = 
		"select product.productName,product.productDetails,product.productPrice,product.ProductImage,category.categoryName \r\n" + 
		"from product \r\n" + 
		"inner join category on product.productCategoryID=category.categoryID";
		
		InputStream inputStream = null;
		ByteArrayOutputStream outputStream = null;
		Statement stmt = null;
		
		try 
		{
			currentCon = DbConnection.getConnection();
	        stmt=currentCon.createStatement();
	        ResultSet result = stmt.executeQuery(selectQuery);
	        
	        while (result.next()) 
			{
				  ProductBean phone = new ProductBean();
				  phone.setProductName(result.getString("productName"));
				  phone.setProductPrice(result.getFloat("productPrice"));
				  phone.setProductDetails(result.getString("productDetails"));					  
				  
				  Blob blob = result.getBlob("productImage");
				    	
				  inputStream = blob.getBinaryStream();
			      outputStream = new ByteArrayOutputStream();
			      byte[] buffer = new byte[4096];
			      int bytesRead = -1;
			             
			      while ((bytesRead = inputStream.read(buffer)) != -1) 
			      {
			           outputStream.write(buffer, 0, bytesRead);                  
			      }
			             
			      byte[] imageBytes = outputStream.toByteArray();
			      String base64Image = Base64.getEncoder().encodeToString(imageBytes);
			            
			      phone.setBase64image(base64Image);				  
			      phoneList.add(phone);
			 }
	        
	        inputStream.close();
	        outputStream.close();  
	        currentCon.close();
		  }
	   
		catch (SQLException | IOException ex) 
		{
			ex.printStackTrace();
		} 
		return phoneList;
	}
	
	public static List<ProductBean> findAllAccessories()
	{
		List<ProductBean> AccList = new ArrayList<>();
		String selectQuery = 
				"select productID, productName, productPrice, ProductDetails, productImage from product where productCategory= Accessories";

		InputStream inputStream = null;
		ByteArrayOutputStream outputStream = null;
		Statement stmt = null;
		
		try 
		{
			currentCon = DbConnection.getConnection();
	        stmt=currentCon.createStatement();
	        ResultSet result = stmt.executeQuery(selectQuery);
	        
	        while (result.next()) 
			{
				  ProductBean acc = new ProductBean();
				  acc.setProductID(result.getInt("productID"));
				  acc.setProductName(result.getString("productName"));
				  acc.setProductPrice(result.getFloat("productPrice"));
				  acc.setProductDetails(result.getString("productDetails"));
				  
				  Blob blob = result.getBlob("productImage");
			    	
				  inputStream = blob.getBinaryStream();
			      outputStream = new ByteArrayOutputStream();
			      byte[] buffer = new byte[4096];
			      int bytesRead = -1;
			             
			      while ((bytesRead = inputStream.read(buffer)) != -1) 
			      {
			           outputStream.write(buffer, 0, bytesRead);                  
			      }
			             
			      byte[] imageBytes = outputStream.toByteArray();
			      String base64Image = Base64.getEncoder().encodeToString(imageBytes);
			            
			      acc.setBase64image(base64Image);				  
			      AccList.add(acc);
			 }
	        currentCon.close();
		  }
	   
		catch (SQLException | IOException ex) 
		{
			ex.printStackTrace();
		} 
		return AccList;
	}
	
	public static List<ProductBean> findAllVideoGames()
	{
		List<ProductBean> videoGamesList = new ArrayList<>();
		String selectQuery = 
				"select productName, productPrice, ProductDetails from product p join category c on c.categoryID = p.productCategoryID where c.categoryName='Video Games'";

		Statement stmt = null;
		InputStream inputStream = null;
		ByteArrayOutputStream outputStream = null;
		
		try 
		{
			currentCon = DbConnection.getConnection();
	        stmt=currentCon.createStatement();
	        ResultSet result = stmt.executeQuery(selectQuery);
	        
	        while (result.next()) 
			{
				  ProductBean vg = new ProductBean();
				  vg.setProductName(result.getString("productName"));
				  vg.setProductPrice(result.getFloat("productPrice"));
				  vg.setProductDetails(result.getString("productDetails"));
				  Blob blob = result.getBlob("ProductImage");
			    	
				  inputStream = blob.getBinaryStream();
			      outputStream = new ByteArrayOutputStream();
			      byte[] buffer = new byte[4096];
			      int bytesRead = -1;
			             
			      while ((bytesRead = inputStream.read(buffer)) != -1) 
			      {
			           outputStream.write(buffer, 0, bytesRead);                  
			      }
			             
			      byte[] imageBytes = outputStream.toByteArray();
			      String base64Image = Base64.getEncoder().encodeToString(imageBytes);
			            
			      vg.setBase64image(base64Image);				  
			      videoGamesList.add(vg);
			 }
	        currentCon.close();
		  }
	   
		catch (SQLException |IOException ex) 
		{
			ex.printStackTrace();
		} 
		return videoGamesList;
	}
	
	public static List<ProductBean> findAllConsoles()
	{
		List<ProductBean> consolesList = new ArrayList<>();
		String selectQuery = 
				"select productName, productPrice, ProductDetails from product p join category c on c.categoryID = p.productCategoryID where c.categoryName='Consoles'";

		InputStream inputStream = null;
		ByteArrayOutputStream outputStream = null;
		Statement stmt = null;
		
		try 
		{
			currentCon = DbConnection.getConnection();
	        stmt=currentCon.createStatement();
	        ResultSet result = stmt.executeQuery(selectQuery);
	        
	        while (result.next()) 
			{
				  ProductBean consoles = new ProductBean();
				  consoles.setProductName(result.getString("productName"));
				  consoles.setProductPrice(result.getFloat("productPrice"));
				  consoles.setProductDetails(result.getString("productDetails"));
				  
				  Blob blob = result.getBlob("ProductImage");
			    	
				  inputStream = blob.getBinaryStream();
			      outputStream = new ByteArrayOutputStream();
			      byte[] buffer = new byte[4096];
			      int bytesRead = -1;
			             
			      while ((bytesRead = inputStream.read(buffer)) != -1) 
			      {
			           outputStream.write(buffer, 0, bytesRead);                  
			      }
			             
			      byte[] imageBytes = outputStream.toByteArray();
			      String base64Image = Base64.getEncoder().encodeToString(imageBytes);
			            
			      consoles.setBase64image(base64Image);
			      consolesList.add(consoles);
			 }
	        currentCon.close();
		  }
	   
		catch (SQLException | IOException ex) 
		{
			ex.printStackTrace();
		} 
		return consolesList;
	}

	public static List<ProductBean> findAllPS()
	{
		List<ProductBean> PSList = new ArrayList<>();
		String selectQuery = 
				"select productName, productPrice, ProductDetails from product p join category c on c.categoryID = p.productCategoryID where c.categoryName='Power Supply'";

		InputStream inputStream = null;
		ByteArrayOutputStream outputStream = null;
		Statement stmt = null;
		
		try 
		{
			currentCon = DbConnection.getConnection();
	        stmt=currentCon.createStatement();
	        ResultSet result = stmt.executeQuery(selectQuery);
	        
	        while (result.next()) 
			{
				  ProductBean ps = new ProductBean();
				  ps.setProductName(result.getString("productName"));
				  ps.setProductPrice(result.getFloat("productPrice"));
				  ps.setProductDetails(result.getString("productDetails"));
				  
				  Blob blob = result.getBlob("ProductImage");
			    	
				  inputStream = blob.getBinaryStream();
			      outputStream = new ByteArrayOutputStream();
			      byte[] buffer = new byte[4096];
			      int bytesRead = -1;
			             
			      while ((bytesRead = inputStream.read(buffer)) != -1) 
			      {
			           outputStream.write(buffer, 0, bytesRead);                  
			      }
			             
			      byte[] imageBytes = outputStream.toByteArray();
			      String base64Image = Base64.getEncoder().encodeToString(imageBytes);
			            
			      ps.setBase64image(base64Image);
			      PSList.add(ps);
			 }
	        currentCon.close();
		  }
	   
		catch (SQLException |IOException ex) 
		{
			ex.printStackTrace();
		} 
		return PSList;
	}

	public static List<ProductBean> findAllCPUs()
	{
		List<ProductBean> cpuList = new ArrayList<>();
		String selectQuery = 
				"select productName, productPrice, ProductDetails from product p join category c on c.categoryID = p.productCategoryID where c.categoryName='CPUs'";

		InputStream inputStream = null;
		ByteArrayOutputStream outputStream = null;
		Statement stmt = null;
		
		try 
		{
			currentCon = DbConnection.getConnection();
	        stmt=currentCon.createStatement();
	        ResultSet result = stmt.executeQuery(selectQuery);
	        
	        while (result.next()) 
			{
				  ProductBean cpu = new ProductBean();
				  cpu.setProductName(result.getString("productName"));
				  cpu.setProductPrice(result.getFloat("productPrice"));
				  cpu.setProductDetails(result.getString("productDetails"));
				  
				  Blob blob = result.getBlob("ProductImage");
			    	
				  inputStream = blob.getBinaryStream();
			      outputStream = new ByteArrayOutputStream();
			      byte[] buffer = new byte[4096];
			      int bytesRead = -1;
			             
			      while ((bytesRead = inputStream.read(buffer)) != -1) 
			      {
			           outputStream.write(buffer, 0, bytesRead);                  
			      }
			             
			      byte[] imageBytes = outputStream.toByteArray();
			      String base64Image = Base64.getEncoder().encodeToString(imageBytes);
			            
			      cpu.setBase64image(base64Image);
			      cpuList.add(cpu);
			 }
	        currentCon.close();
		  }
	   
		catch (SQLException | IOException ex) 
		{
			ex.printStackTrace();
		} 
		return cpuList;
	}
	
	public static List<ProductBean> findAllGPU()
	{
		List<ProductBean> gpuList = new ArrayList<>();
		String selectQuery = 
				"select productName, productPrice, ProductDetails from product p join category c on c.categoryID = p.productCategoryID where c.categoryName='GPUs'";

		InputStream inputStream = null;
		ByteArrayOutputStream outputStream = null;
		Statement stmt = null;
		
		try 
		{
			currentCon = DbConnection.getConnection();
	        stmt=currentCon.createStatement();
	        ResultSet result = stmt.executeQuery(selectQuery);
	        
	        while (result.next()) 
			{
				  ProductBean gpu = new ProductBean();
				  gpu.setProductName(result.getString("productName"));
				  gpu.setProductPrice(result.getFloat("productPrice"));
				  gpu.setProductDetails(result.getString("productDetails"));
				  Blob blob = result.getBlob("ProductImage");
			    	
				  inputStream = blob.getBinaryStream();
			      outputStream = new ByteArrayOutputStream();
			      byte[] buffer = new byte[4096];
			      int bytesRead = -1;
			             
			      while ((bytesRead = inputStream.read(buffer)) != -1) 
			      {
			           outputStream.write(buffer, 0, bytesRead);                  
			      }
			             
			      byte[] imageBytes = outputStream.toByteArray();
			      String base64Image = Base64.getEncoder().encodeToString(imageBytes);
			            
			      gpu.setBase64image(base64Image);
			      gpuList.add(gpu);
			 }
	        currentCon.close();
		  }
	   
		catch (SQLException | IOException ex) 
		{
			ex.printStackTrace();
		} 
		return gpuList;
	}
	
	public static List<ProductBean> findAllLaptops()
	{
		List<ProductBean> laptopList = new ArrayList<>();
		String selectQuery = 
				"select productName, productPrice, ProductDetails from product p join category c on c.categoryID = p.productCategoryID where c.categoryName='Laptops'";

		InputStream inputStream = null;
		ByteArrayOutputStream outputStream = null;
		Statement stmt = null;
		
		try 
		{
			currentCon = DbConnection.getConnection();
	        stmt=currentCon.createStatement();
	        ResultSet result = stmt.executeQuery(selectQuery);
	        
	        while (result.next()) 
			{
				  ProductBean laptop = new ProductBean();
				  laptop.setProductName(result.getString("productName"));
				  laptop.setProductPrice(result.getFloat("productPrice"));
				  laptop.setProductDetails(result.getString("productDetails"));
				  Blob blob = result.getBlob("ProductImage");
			    	
				  inputStream = blob.getBinaryStream();
			      outputStream = new ByteArrayOutputStream();
			      byte[] buffer = new byte[4096];
			      int bytesRead = -1;
			             
			      while ((bytesRead = inputStream.read(buffer)) != -1) 
			      {
			           outputStream.write(buffer, 0, bytesRead);                  
			      }
			             
			      byte[] imageBytes = outputStream.toByteArray();
			      String base64Image = Base64.getEncoder().encodeToString(imageBytes);
			            
			      laptop.setBase64image(base64Image);
			      laptopList.add(laptop);
			 }
	        currentCon.close();
		  }
	   
		catch (SQLException |IOException ex) 
		{
			ex.printStackTrace();
		} 
		return laptopList;
	}
	
	public static List<ProductBean> findAllPCs()
	{
		List<ProductBean> pcList = new ArrayList<>();
		String selectQuery = 
				"select productName, productPrice, ProductDetails from product p join category c on c.categoryID = p.productCategoryID where c.categoryName='PCs'";

		InputStream inputStream = null;
		ByteArrayOutputStream outputStream = null;
		Statement stmt = null;
		
		try 
		{
			currentCon = DbConnection.getConnection();
	        stmt=currentCon.createStatement();
	        ResultSet result = stmt.executeQuery(selectQuery);
	        
	        while (result.next()) 
			{
				  ProductBean pc = new ProductBean();
				  pc.setProductName(result.getString("productName"));
				  pc.setProductPrice(result.getFloat("productPrice"));
				  pc.setProductDetails(result.getString("productDetails"));
				  Blob blob = result.getBlob("ProductImage");
			    	
				  inputStream = blob.getBinaryStream();
			      outputStream = new ByteArrayOutputStream();
			      byte[] buffer = new byte[4096];
			      int bytesRead = -1;
			             
			      while ((bytesRead = inputStream.read(buffer)) != -1) 
			      {
			           outputStream.write(buffer, 0, bytesRead);                  
			      }
			             
			      byte[] imageBytes = outputStream.toByteArray();
			      String base64Image = Base64.getEncoder().encodeToString(imageBytes);
			            
			      pc.setBase64image(base64Image);
			      pcList.add(pc);
			 }
	        currentCon.close();
		  }
	   
		catch (SQLException | IOException ex) 
		{
			ex.printStackTrace();
		} 
		return pcList;
	}
	
	public static List<ProductBean> findAllICchips()
	{
		List<ProductBean> ICList = new ArrayList<>();
		String selectQuery = 
				"select productName, productPrice, ProductDetails from product p join category c on c.categoryID = p.productCategoryID where c.categoryName='IC Chips'";

		InputStream inputStream = null;
		ByteArrayOutputStream outputStream = null;
		Statement stmt = null;
		
		try 
		{
			currentCon = DbConnection.getConnection();
	        stmt=currentCon.createStatement();
	        ResultSet result = stmt.executeQuery(selectQuery);
	        
	        while (result.next()) 
			{
				  ProductBean ic = new ProductBean();
				  ic.setProductName(result.getString("productName"));
				  ic.setProductPrice(result.getFloat("productPrice"));
				  ic.setProductDetails(result.getString("productDetails"));
				  
				  Blob blob = result.getBlob("ProductImage");
			    	
				  inputStream = blob.getBinaryStream();
			      outputStream = new ByteArrayOutputStream();
			      byte[] buffer = new byte[4096];
			      int bytesRead = -1;
			             
			      while ((bytesRead = inputStream.read(buffer)) != -1) 
			      {
			           outputStream.write(buffer, 0, bytesRead);                  
			      }
			             
			      byte[] imageBytes = outputStream.toByteArray();
			      String base64Image = Base64.getEncoder().encodeToString(imageBytes);
			            
			      ic.setBase64image(base64Image);
			      ICList.add(ic);
			 }
	        currentCon.close();
		  }
	   
		catch (SQLException |IOException ex) 
		{
			ex.printStackTrace();
		} 
		return ICList;
	}
	
	public static List<ProductBean> findAllMBs()
	{
		List<ProductBean> MBList = new ArrayList<>();
		String selectQuery = 
				"select productName, productPrice, ProductDetails from product p join category c on c.categoryID = p.productCategoryID where c.categoryName='Motherboard'";
		
		InputStream inputStream = null;
		ByteArrayOutputStream outputStream = null;
		Statement stmt = null;
		
		try 
		{
			currentCon = DbConnection.getConnection();
	        stmt=currentCon.createStatement();
	        ResultSet result = stmt.executeQuery(selectQuery);
	        
	        while (result.next()) 
			{
				  ProductBean MB = new ProductBean();
				  MB.setProductName(result.getString("productName"));
				  MB.setProductPrice(result.getFloat("productPrice"));
				  MB.setProductDetails(result.getString("productDetails"));
				  
				  Blob blob = result.getBlob("ProductImage");
			    	
				  inputStream = blob.getBinaryStream();
			      outputStream = new ByteArrayOutputStream();
			      byte[] buffer = new byte[4096];
			      int bytesRead = -1;
			             
			      while ((bytesRead = inputStream.read(buffer)) != -1) 
			      {
			           outputStream.write(buffer, 0, bytesRead);                  
			      }
			             
			      byte[] imageBytes = outputStream.toByteArray();
			      String base64Image = Base64.getEncoder().encodeToString(imageBytes);
			            
			      MB.setBase64image(base64Image);
			      MBList.add(MB);
			 }
	        currentCon.close();
		  }
	   
		catch (SQLException |IOException ex) 
		{
			ex.printStackTrace();
		} 
		return MBList;
	}
}	