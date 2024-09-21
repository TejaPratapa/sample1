class Bublledemo
{
public static void main(string args[])
{
int n,i,j,temp;
int a[]=new int [20];
Scanner S=new Scanner(system.in);
system.out.println("enter totoal number of elements");
n=s.nextInt[]
system.out.println("eneter elements");
for(i=o;i<n;i++)
a[i]=s.nextInt[]
for(i=0;i<n;i++)
{
for(j=0;j<n-1;j++)
{
if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
system.out.println("the sorted elements are");
for(i=0;i<n;i++)
system.out.println("\t:"+a[i]);
}
}