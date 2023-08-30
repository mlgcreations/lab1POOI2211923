public class Main
{
	public static void main(String[] args) {
		//1a
		if(6<6*5)
		    System.out.println("Hello");
		    System.out.println("There");
		    //respuesta:Hello
		    //There
		    
		    /* 1 b*/
		    int x=1, y=2, z=3;
		    
		    if(x>y)
		    if(x>z)
		        System.out.println("11111");
		    else
		        System.out.println("22222");
		        
		  //respuesta:no imprime nada
		  
		  /* 1 c*/
		  
		
		  if(x<z)
		    System.out.println("*");
		  else if (x==z)
		    System.out.println("&");
		  else
		    System.out.println("$");
		  
		  //respuesta:*
		  
		  /* 1 d*/
		  
		  if(x<y)
		     System.out.println("####");
		  else
		     System.out.println("&&&&");
		     System.out.println("****");
		  
		  //respuesta:####
		  //****
		  
		  /* 1 e*/
		   if(x>y)
		     System.out.println("####");
		  else{
		     System.out.println("&&&&");
		     System.out.println("****");
		  }
		  
		  //respuesta:&&&&
		  //****
		  
		   /* 1 f*/
		   int a1=100; int a2=200;
		   if(a1>100 && a2<=200)
		    System.out.print(a1+" "+a2+" "+(2*a1+a2));
		   else
		    System.out.print(a1+" "+a2+" "+(2*a1-a2));
		    
		   //respuesta:100 200 0
		   
		    /* 1 g*/
		    
		    if(++x > y++ || x-- > 0)
		        z++;
		    else
		        z--;
		    System.out.println(x+" "+y+" "+z);
		    
		   //respuesta:1 2 4
		   
		   /* 1 h*/
		   x=1;
		   y=2;
		   z=3;
		     if(x<y){
		     System.out.println("####");
		     System.out.println("****");
		     }
		  else
		     System.out.println("&&&&");
		    
		   //respuesta:####
		   //&&&&
		   
		   /* 1 i*/
		   
		   if('x' > 'y' || 66 > (int)('A'))
		    System.out.println("#*#");
		    
		   //respuesta:#*#
		   
		   /* 1 k*/
		   
		   if(x < z)
		    System.out.println("*");
		   else if(x==z)
		    System.out.println("&");
		   else
		    System.out.println("$");
		   
		   //respuesta:*
		     
	}
}
