import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class 登录系统 {
	public void add() {
		Map<String, String> list = new HashMap<String, String>();
		System.out.println("注册系统");

		while (true) {
			System.out.println("是否注册账号");
			String an = new Scanner(System.in).next();
			if ("是".equals(an)) {
				System.out.println("请输入您设置的的账号：");
				String zh = new Scanner(System.in).next();
				System.out.print("请设置一个有效密码： ");
				String password = new Scanner(System.in).next();
				密码 in = new 密码(password);
				list.put(zh, password);
			} else {
				break;
			}
		}
		try {

		} catch (Exception e) {
			// TODO: handle exception
		}
//		
//		try {
//			String line = System.getProperty("line.separator");
//			StringBuffer str = new StringBuffer();
//			FileWriter fw = new FileWriter("C:\\Users\\11249\\Desktop\\新建文本文档.txt", true);
//			Set set = list.entrySet();
//			Iterator iter = set.iterator();
//			while(iter.hasNext()){
//			Map.Entry entry = (Map.Entry)iter.next();
//			str.append(entry.getKey()+" : "+entry.getValue()).append(line);
//			}
//			fw.write(str.toString());
//			fw.close();
//			} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			}

		qweqw qw = new qweqw();
		qw.write(list);
		
		boolean flag = true;
		boolean flag2 = true;
		boolean flag3 = true;
		System.out.println("登录系统");
		System.out.println("请输入您的账号");
		while (flag3) {
			String dlzh = new Scanner(System.in).next();
			for (Map.Entry<String, String> a : list.entrySet()) {
				if (a.getKey().equals(dlzh)) {
					System.out.println("请输入您的密码：");
					String mima = list.get(dlzh);
					while (flag2) {
						String mm = new Scanner(System.in).next();
						if (mima.equals(mm)) {
							System.out.println("密码正确，登陆成功");
							flag3 = false;
							flag2 = false;
							flag=false;
						} else {
							System.out.println("密码错误，请重新输入");
						}
					}
				} 
			}
			if (flag) {
				System.out.println("该账号不存在");
					
			}
			
		}
	}

	public static void main(String[] args) {
		登录系统 asd = new 登录系统();
		asd.add();
	}
}
