#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main () {

	int M[5][5], i,j,k,z, aux = 0;

	srand(time(NULL));
	
	for(i=0;i<5;i++){
		for(j=0;j<5;j++){
		
			aux = 0;
			M[i][j] = 1+ rand() % 16;
	
			for(k = i; k >= 0; k--){

				if(aux == 1){
					j = j - 1;
					break;
				}

				for(z = j; z >= 0; z--){
					if((M[k][z] == M[i][j] && k != i && z != j)){
						aux = 1;
						break;
					}
				}
			}
		}
	}
			

	printf("\n\n\n\n");

	for(i=0;i<5;i++){
		for(j=0;j<5;j++){
			printf("%d\t", M[i][j]);
		}
		printf("\n");
	}

	return 0;
}
