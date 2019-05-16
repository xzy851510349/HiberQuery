package com.hqyj.Text;

import java.util.Scanner;

import org.junit.Test;

import com.hqyj.Bean.Provice;
import com.hqyj.Service.ProviceService;

public class Text1 {
	@Test
	public void Demo1(){
		
		Scanner s = new Scanner(System.in);
		String input  =  s.next();
		Provice provice = new Provice();
		provice.setName(input);
		ProviceService proviceservice = new ProviceService();
		 int p = proviceservice.AddProvice(input);
		if (p==1) {
			System.out.println("增加成功");
		}else {
			System.out.println("增加失败");
		}
		
	}

}
