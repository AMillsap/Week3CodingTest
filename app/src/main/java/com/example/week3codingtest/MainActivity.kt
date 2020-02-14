package com.example.week3codingtest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var list : IntArray = intArrayOf(1,2,4,7,8,10,13,24,51)
        var search = 8
        Log.d("TAG", findIndex(list,search).toString())
        Log.d("TAG", getPow(3,5).toString())
    }

    fun findIndex(arr: IntArray, x: Int): Int
    {
        var min = 0
        var max = arr.size - 1
        while (min <= max) {
            val middle = min + (max - min) / 2
            if (arr[middle] == x)
            {
                return middle
            }
            if (arr[middle] < x)
            {
                min = middle + 1
            }
            else
            {
                max = middle - 1
            }
        }
        return -1
    }

    fun getPow(n : Int, m : Int) : Int
    {
        var result = n
        var counter = 1

        while(counter < m)
        {
            if(m < 0)
            {
                result /= n
                counter ++
            }
            else
            {
                result *= n
                counter ++
            }
        }

        return result
    }

}