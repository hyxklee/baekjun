#include <iostream>
using namespace std;
int main(){
	int a,b,c,result;
	cin>>a>>b>>c;
	if((a==b)and(b==c)){
		result = 10000+(a*1000);
	}
	else if(a==b){
		result = 1000+a*100;
	}
	else if(a==c){
		result = 1000+a*100;
	}
	else if(b==c){
		result = 1000+b*100;
	}
	else{
		result = ((a>b?a:b)>c?(a>b?a:b):c)*100;
	}
	cout<<result;
	return 0;
}