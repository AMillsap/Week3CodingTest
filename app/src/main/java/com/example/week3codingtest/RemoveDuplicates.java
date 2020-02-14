package com.example.week3codingtest;

public class RemoveDuplicates
{
    int arrayOfDuplicates[] = {1, 2, 3, 1, 5, 6, 3};
    int arrayNoDuplicates[];
    int justDuplications[];

    int[] removeDuplicates()
    {
        int index = 0;

        for (int i = 0; i < arrayOfDuplicates.length; i++)
        {
            for (int j = 0; j < arrayOfDuplicates.length; j++)
            {
                if(i != j)
                {
                    if (arrayOfDuplicates[i] == arrayOfDuplicates[j])
                    {
                        justDuplications[index] = arrayOfDuplicates[i];
                        index++;
                    }
                }
            }
        }

        for(int i = 0; i < arrayOfDuplicates.length; i++)
        {
            for(int j = 0; j < justDuplications.length; j++)
            {
                if(arrayOfDuplicates[i] != justDuplications[j])
                {
                    arrayNoDuplicates[i] = arrayOfDuplicates[i];
                }
            }
        }
        return arrayNoDuplicates;
    }
}
