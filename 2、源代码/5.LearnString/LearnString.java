import java.io.IOException;

public class LearnString {
    public static void main(String[] args) throws IOException{
        String str1 = new String("Hello,World!");
        String str2 = "He";
        char[] charArray={'H','e','l','l','o'};

        System.out.println("str1:"+str1);
        System.out.println("str2:"+str2);
        System.out.print("charArray:");
        for(int i=0;i<charArray.length;i++)
            System.out.print(charArray[i]);
        System.out.println('\n');
        System.out.println("str1的长度为:"+str1.length());
        if(str2.isEmpty()) {
            System.out.println("str2为空.");
        }
        else System.out.println("str2不为空.");
        System.out.println("str1[2]处的 char 值:"+str1.charAt(2));
        System.out.println("str1[2]处的字符（Unicode 代码点）:"+str1.codePointAt(2));
        System.out.println("指定索引之前的字符（Unicode 代码点）:"+str1.codePointBefore(2));
        System.out.println("str1的[2]-[5]范围中的 Unicode 代码点数:"+str1.codePointCount(2,5));
        System.out.println("str1中从str[2]处偏移2个代码点的索引:"+str1.offsetByCodePoints(2,2));
        str1.getChars(0, 2, charArray, 1);  //将字符从此字符串复制到目标字符数组
        System.out.print("getChars将字符从此字符串复制到目标字符数组之后 — charArray:");
        for(int i=0;i<charArray.length;i++)
            System.out.print(charArray[i]);
        System.out.println();

        //使用给定的 charset 将此 String 编码到 byte 序列，并将结果存储到新的 byte 数组。
        byte b[]=str1.getBytes("unicode") ;
        System.out.println("str1.getBytes(\"unicode\"):");
        for(int i=0;i<b.length;i++)
            System.out.print(b[i]+" ");
        System.out.println();
        System.out.println("之后的新字符串 (b,\"UTF-16\"):"+new String(b,"UTF-16"));
        System.out.println("字符串str1与str2比较判断相等:"+str1.equals(str2));
        System.out.println("字符串str1与指定的 StringBuffer 比较:"+str1.contentEquals(str1));
        CharSequence str="zh";
        System.out.println("字符串str1与指定的 CharSequence) 比较:"+str1.contentEquals(str));

        System.out.println("将str1与str2比较判断相等，不考虑大小写:"+str1.equalsIgnoreCase(str2));
        System.out.println("按字典顺序比较两个字符串str1和str2："+str1.compareTo(str2));
        System.out.println("按字典顺序（不考虑大小写）比较两个字符串str1和str2："+str1.compareToIgnoreCase(str2));
        System.out.println("测试两个字符串区域是否相等："+str1.regionMatches(0, str2, 0, 1));
        System.out.println("测试此字符串是否以指定的前缀(He)开始："+str1.startsWith("He",0));
        System.out.println("测试此字符串是否以指定的后缀(lo)结束："+str1.endsWith("lo"));
        System.out.println("返回字符串str1的Hash码:"+str1.hashCode());
        System.out.println("返回字符a在此字符串中第一次出现处的索引："+str1.indexOf("l"));
        System.out.println("返回字符a在此字符串中最后一次出现处的索引："+str1.lastIndexOf("l"));
        System.out.println("返回一个新的字符串，它是字符串str1的一个子字符串。(从1到3部分截取)："+str1.substring(1, 3));
        System.out.println("返回一个新的字符序列，它是字符串str1的一个子序列。(从0到3部分截取)："+str1.subSequence(0,3));
        System.out.println("将指定字符串（hhh）连接到此字符串的结尾:"+str1.concat("hhh"));
        System.out.println("返回一个新的字符串，它是通过用 newChar (A)替换此字符串中出现的所有 oldChar (A):"+str1.replace("a","A"));
        System.out.println("告知str字符串是否匹配给定的正则表达式："+str1.matches("[A-Za-z0-9_\\-\\u4e00-\\u9fa5]+"));
        System.out.println("字符串str1是否包含指定的字符数组(e):"+str1.contains("e"));
        System.out.println("使用给定的字符串(*)替换此字符串匹配给定的(正则)表达式(e)的第一个子字符串:"+str1.replaceFirst("e", "*"));
        System.out.println("使用给定的字符串(*)替换此字符串匹配给定的(正则)表达式(l)的所有子字符串:"+str1.replaceAll("l", "*"));

        System.out.println("根据匹配给定的(正则)表达式来拆分此字符串:");
        String[] strings;
        strings=str1.split(",");
        for (int i = 0; i < strings.length; i++)
            System.out.printf("第%d部分：%s\t",i,strings[i]);
        System.out.println();

        System.out.println("str2字符串字母全部转小写:"+str2.toLowerCase());
        System.out.println("str1字符串字母全部转大写:"+str1.toUpperCase());
        System.out.println("返回字符串( ha ha )的副本，忽略前导空白和尾部空白："+" ha ha ".trim());
        System.out.println("toString()方法返回本身:"+str1.toString());

        char[] charArrayCopy=str1.toCharArray();
        System.out.println("str1.toCharArray()生成对应的字符数组：");
        for(int i=0;i<charArrayCopy.length;i++)
            System.out.print(charArrayCopy[i]);
        System.out.println();

        System.out.println("按照特定格式打印字符串（静态方法）:");
        System.out.println(String.format("这是一个数字：%04d\n",99));

        System.out.println("返回其他形式（以整型数字10为例）的的字符串表示形式:"+str1.valueOf(10));
        System.out.println("返回字符数组charArrayCopy中表示该字符序列的String:"+str1.copyValueOf(charArrayCopy, 0, 4));
        System.out.println("返回字符串str1的规范化表示形式:"+str1.intern());
        System.out.println();
    }
}