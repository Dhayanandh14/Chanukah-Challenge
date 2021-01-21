#include <iostream>
using namespace std;
int main(){

    int p,n,k,count;
    cin>>p;
    for(int i=0;i<p;i++){
      cin>>n>>k;
       count=0;
       for(int j=1;j<=k;j++){
         count = count +j;
       }
      cout<<n<<" "<<(count+k)<<endl;
    }
}
