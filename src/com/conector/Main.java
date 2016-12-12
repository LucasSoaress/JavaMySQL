package com.conector;
import java.sql.Connection;

public class Main {

	public static void main(String[] args) 
	{
		Connection con = null;
		try
		{
			String userName = "root";
			String password = "";
			String url = "jdbc:mysql://localhost/cdcol";
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Conexao com o banco de dados estabelecida com sucesso!!");
		}
		catch(Exception e)
		{
			System.out.println("Ocorreu um erro na conexao com o banco de dados!!");
		}
		
		finally
		{
			try
			{
				if(con != null)
				{
					con.close();
					System.out.println("Conexao encerrada");
				}		
			}
			catch(Exception e)
			{
				System.out.println("Ocorreu um erro");
			}
			
		}
	}
}
