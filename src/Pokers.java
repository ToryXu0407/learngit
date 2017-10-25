
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Pokers {
	//static String[] pokers;
	public static void main(String[]args){
		String[] pokers = new String[108];
		String[] playerA = new String[25];
		String[] playerB = new String[25];
		String[] playerC = new String[25];
		String[] playerD = new String[25];
		pokers=newPokers();
		System.out.println("初始牌组：");
		printpokers(pokers);
		pokers = washpokers(pokers);
		System.out.println("");
		System.out.println("洗牌之后：");
		printpokers(pokers);
		String canmou = RandomPoker();
		System.out.println("");
		System.out.println("");
		sendPokers(pokers,playerA,playerB,playerC,playerD);
		System.out.println("");
		System.out.println("发牌之后：");
		System.out.println("playerA的牌：");
		printpokers(playerA);
		System.out.println("");
		System.out.println("playerB的牌：");
		printpokers(playerB);
		System.out.println("");
		System.out.println("playerC的牌：");
		printpokers(playerC);
		System.out.println("");
		System.out.println("playerD的牌：");
		printpokers(playerD);
		playerA= sort(playerA,canmou);
		playerB= sort(playerB,canmou);
		playerC= sort(playerC,canmou);
		playerD= sort(playerD,canmou);
		System.out.println("");
		System.out.println("");
		System.out.println("参谋牌是"+canmou+"色。");
		System.out.println("");
		System.out.println("理牌之后：");
		System.out.println("");
		System.out.println("playerA的牌：");
		printpokers(playerA);
		System.out.println("");
		System.out.println("playerB的牌：");
		printpokers(playerB);
		System.out.println("");
		System.out.println("playerC的牌：");
		printpokers(playerC);
		System.out.println("");
		System.out.println("playerD的牌：");
		printpokers(playerD);
		
	}





private static String[] sort(String[] player,String color) {
		// TODO 自动生成的方法存根
	
	if(color == "黑桃"){
		String[] defined = {"红桃5","Joker","joker","黑桃3","草花3","黑桃2","红桃2","草花2","方块2"
				,"黑桃A","黑桃K","黑桃Q","黑桃J","黑桃10","黑桃9","黑桃8","黑桃7","黑桃6","黑桃5","黑桃4",
				"红桃A","红桃K","红桃Q","红桃J","红桃10","红桃9","红桃8","红桃7","红桃6","红桃5","红桃4","红桃3",
				"草花A","草花K","草花Q","草花J","草花10","草花9","草花8","草花7","草花6","草花5","草花4",
				"方块A","方块K","方块Q","方块J","方块10","方块9","方块8","方块7","方块6","方块5","方块4","方块3"};
		final List<String> definedOrder = Arrays.asList(defined);
		List<String> toBeOrderedList = Arrays.asList(player);
		Collections.sort(toBeOrderedList, new Comparator<String>()
		{
		    public int compare(String o1, String o2)
		    {
		        int io1 = definedOrder.indexOf(o1);
		        int io2 = definedOrder.indexOf(o2);
		        return io1 - io2;
		    }
		});
		}
	else if(color == "草花"){
		String[] defined = {"红桃5","Joker","joker","草花3","黑桃3","草花2","黑桃2","红桃2","方块2",
				"草花A","草花K","草花Q","草花J","草花10","草花9","草花8","草花7","草花6","草花5","草花4",
				"黑桃A","黑桃K","黑桃Q","黑桃J","黑桃10","黑桃9","黑桃8","黑桃7","黑桃6","黑桃5","黑桃4",
				"红桃A","红桃K","红桃Q","红桃J","红桃10","红桃9","红桃8","红桃7","红桃6","红桃5","红桃4","红桃3",
				"方块A","方块K","方块Q","方块J","方块10","方块9","方块8","方块7","方块6","方块5","方块4","方块3"};
		final List<String> definedOrder = Arrays.asList(defined);
		List<String> toBeOrderedList = Arrays.asList(player);
		Collections.sort(toBeOrderedList, new Comparator<String>()
		{
		    public int compare(String o1, String o2)
		    {
		        int io1 = definedOrder.indexOf(o1);
		        int io2 = definedOrder.indexOf(o2);
		        return io1 - io2;
		    }
		});
		}
	else if (color =="红桃"){
		String[] defined = {"红桃5","Joker","joker","红桃3","方块3","红桃2","黑桃2","草花2","方块2",
				"红桃A","红桃K","红桃Q","红桃J","红桃10","红桃9","红桃8","红桃7","红桃6","红桃5","红桃4",
				"黑桃A","黑桃K","黑桃Q","黑桃J","黑桃10","黑桃9","黑桃8","黑桃7","黑桃6","黑桃5","黑桃4","黑桃3",
				"草花A","草花K","草花Q","草花J","草花10","草花9","草花8","草花7","草花6","草花5","草花4","草花3",
				"方块A","方块K","方块Q","方块J","方块10","方块9","方块8","方块7","方块6","方块5","方块4"};
		final List<String> definedOrder = Arrays.asList(defined);
		List<String> toBeOrderedList = Arrays.asList(player);
		Collections.sort(toBeOrderedList, new Comparator<String>()
		{
		    public int compare(String o1, String o2)
		    {
		        int io1 = definedOrder.indexOf(o1);
		        int io2 = definedOrder.indexOf(o2);
		        return io1 - io2;
		    }
		});
	}
	else if (color =="方块"){
		String[] defined = {"红桃5","Joker","joker","方块3","红桃3","方块2","黑桃2","红桃2","草花2",
				"方块A","方块K","方块Q","方块J","方块10","方块9","方块8","方块7","方块6","方块5","方块4",
				"黑桃A","黑桃K","黑桃Q","黑桃J","黑桃10","黑桃9","黑桃8","黑桃7","黑桃6","黑桃5","黑桃4","黑桃3",
				"红桃A","红桃K","红桃Q","红桃J","红桃10","红桃9","红桃8","红桃7","红桃6","红桃5","红桃4",
				"草花A","草花K","草花Q","草花J","草花10","草花9","草花8","草花7","草花6","草花5","草花4","草花3",
				};
		final List<String> definedOrder = Arrays.asList(defined);
		List<String> toBeOrderedList = Arrays.asList(player);
		Collections.sort(toBeOrderedList, new Comparator<String>()
		{
		    public int compare(String o1, String o2)
		    {
		        int io1 = definedOrder.indexOf(o1);
		        int io2 = definedOrder.indexOf(o2);
		        return io1 - io2;
		    }
		});
	}
	
	
	
		return player;
	}





private static void sendPokers(String[] pokers,String[] playerA,String[] playerB,String[] playerC,String[] playerD) {
		// TODO 自动生成的方法存根
		for(int i = 0;i<25;i++){
			playerA[i]=pokers[i*4];
			playerB[i]=pokers[i*4+1];
			playerC[i]=pokers[i*4+2];
			playerD[i]=pokers[i*4+3];
		}
	}

private static String[] washpokers(String[] pokers) {
		// TODO 自动生成的方法存根
		int index;
		String[] pokers1 = new String[pokers.length];
		boolean[] mark = new boolean[pokers.length];
		Random rd = new Random();
		for(int i =0;i<pokers.length;i++){
			index = rd.nextInt(pokers.length);
			if(mark[index]==false){
				pokers1[i]=pokers[index];
				mark[index]=true;
			}
			else
				i--;
		}
		return pokers1;
	}

private static String RandomPoker() {
		// TODO 自动生成的方法存根
		Random rd = new Random();
		String color = null;
		int id = rd.nextInt(5);
		if(id==1)
			color = "黑桃";
		else if(id==2)
			color = "红桃";
		else if(id==3)
			color = "草花";
		else if(id==4)
			color = "方块";
		return color;
	}

private static void printpokers(String[] pokers) {
		// TODO 自动生成的方法存根
	System.out.print("当前牌序为：");
		for(int i =0;i<pokers.length;i++){
			if(i%25==0)
				System.out.println("");
			System.out.print(pokers[i]+" ");
		}
	}
private static String[] newPokers() {
		// TODO 自动生成的方法存根
	int i = 0;
	int j =0;
	String[] poker = new String[108];
	String[] color = {"黑桃","红桃","草花","方块"};
	String[] poke = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	String[] wang = {"joker","Joker"};
	for(i =0;i<13;i++){
			poker[i*4]=color[0]+poke[i];
			poker[i*4+1]=color[1]+poke[i];
			poker[i*4+2]=color[2]+poke[i];
			poker[i*4+3]=color[3]+poke[i];
		}
	for(i =13;i<26;i++){
		poker[i*4]=color[0]+poke[i-13];
		poker[i*4+1]=color[1]+poke[i-13];
		poker[i*4+2]=color[2]+poke[i-13];
		poker[i*4+3]=color[3]+poke[i-13];
	}
	System.arraycopy(wang, 0, poker, i*4, 2);
	System.arraycopy(wang, 0, poker, i*4+2, 2);
	return poker;
	}
//假装更改过了。
}