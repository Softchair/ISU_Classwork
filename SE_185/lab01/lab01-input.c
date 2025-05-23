/*----------------------------------------------------------------------------
-		    SE 185: Lab 01 - Getting to Know the 185 Environment		 	 -
-	Name:	 Camden Fergen													 -
- 	Section: 2																 -
-	NetID:	 cfergen													     -
-	Date:	 1/25/2022													     -
-----------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------
-								Includes									 -
-----------------------------------------------------------------------------*/
#include <stdio.h>
#include <stdlib.h>

/*----------------------------------------------------------------------------
-								Implementation								 -
-----------------------------------------------------------------------------*/
int main(int argc, char *argv[])
{
    /* DO NOT EDIT THIS FILE */
    char net_id[1000];

    int number = 0;

    printf("\nValue before input: %d\n", number);

    printf("\nType a number: ");
    scanf("%d", &number);

    printf("Type your NetID: ");
    scanf("%s", net_id);

    printf("\nYour input was %d ", number);
    printf("and your ISU email is %s@iastate.edu", net_id);

    return 0;
}
