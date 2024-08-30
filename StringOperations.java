import java.util.Scanner;
public class StringOperations {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println(&quot;Enter a string:&quot;);
String str = sc.nextLine();
System.out.println(&quot;Enter another string for comparison and insertion:&quot;);
String str2 = sc.nextLine();
System.out.println(&quot;Enter a character:&quot;);
char ch = sc.next().charAt(0);
String toggleCase = &quot;&quot;;
for (int i = 0; i &lt; str.length(); i++) {
char c = str.charAt(i);
if (Character.isUpperCase(c))
toggleCase += Character.toLowerCase(c);
else
toggleCase += Character.toUpperCase(c);
}
System.out.println(&quot;Toggle case: &quot; + toggleCase);
String reversed = new StringBuilder(str).reverse().toString();
System.out.println(&quot;Reversed string: &quot; + reversed);
System.out.println(&quot;Comparison result: &quot; + str.compareTo(str2));
String inserted = str.substring(0, str.length() / 2) + str2 + str.substring(str.length() / 2);
System.out.println(&quot;After insertion: &quot; + inserted);
System.out.println(&quot;Upper case: &quot; + str.toUpperCase());
System.out.println(&quot;Lower case: &quot; + str.toLowerCase());
int pos = str.indexOf(ch);
if (pos == -1)
System.out.println(ch + &quot; is not present in the string.&quot;);
else
System.out.println(ch + &quot; is present at position &quot; + (pos + 1));
if (str.equals(reversed))
System.out.println(&quot;The string is a palindrome.&quot;);
else
System.out.println(&quot;The string is not a palindrome.&quot;);
int words = str.split(&quot;\\s+&quot;).length;
int vowels = 0, consonants = 0;
str = str.toLowerCase();
for (int i = 0; i &lt; str.length(); i++) {
char c = str.charAt(i);
if (c &gt;= &#39;a&#39; &amp;&amp; c &lt;= &#39;z&#39;) {
if (c == &#39;a&#39; || c == &#39;e&#39; || c == &#39;i&#39; || c == &#39;o&#39; || c == &#39;u&#39;)
vowels++;
else
consonants++;
}
}
System.out.println(&quot;Number of words: &quot; + words);
System.out.println(&quot;Number of vowels: &quot; + vowels);
System.out.println(&quot;Number of consonants: &quot; + consonants);
}
}