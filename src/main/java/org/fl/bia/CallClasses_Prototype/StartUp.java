package org.fl.bia.CallClasses_Prototype;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;


public class StartUp {

	public static void main(String[] args)
	{

		try
		{
			String path = "file:C:\\Work/Workspaces/Java_Workspace/Simple_HelloWorld/target/classes/";

			URL myURL = new URL(path);
			URL[] urls = new URL[] {myURL};
			
			ClassLoader myClassLoader = new URLClassLoader(urls);
			Class<?> myClass = myClassLoader.loadClass("org.fl.bia.helloworld.Print_HelloWorld");
			
			System.out.println("aClass.getName() = "+ myClass.getName());
			
			Method m = myClass.getMethod("print_HelloWorld");
			m.invoke(null);
		}
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (NoSuchMethodException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SecurityException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IllegalArgumentException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (InvocationTargetException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
