package com.example.threadpoolexecutor

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.concurrent.LinkedBlockingQueue
import java.util.concurrent.ScheduledThreadPoolExecutor
import java.util.concurrent.SynchronousQueue
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val threadPool = ThreadPoolExecutor(
            2,
            10,
            2000,
            TimeUnit.MILLISECONDS,
            SynchronousQueue()
        )

        threadPool.execute{
            for(i in 1..100000){
                println("Task 1 is running on ${Thread.currentThread().name}")
            }
            println("Task 1 ThreadName123: ${Thread.currentThread().name}")
        }

        threadPool.execute{
            for(i in 1..100000){
                println("Task 2 is running on ${Thread.currentThread().name}")
            }
            println("Task 2 ThreadName123: ${Thread.currentThread().name}")
        }
        threadPool.execute{
            for(i in 1..100000){
                println("Task 3 is running on ${Thread.currentThread().name}")
            }
            println("Task 3 ThreadName123: ${Thread.currentThread().name}")
        }
        threadPool.execute{
            for(i in 1..100000){
                println("Task 4 is running on ${Thread.currentThread().name}")
            }
            println("Task 4 ThreadName123: ${Thread.currentThread().name}")
        }
        threadPool.execute{
            for(i in 1..100000){
                println("Task 5 is running on ${Thread.currentThread().name}")
            }
            println("Task 5 ThreadName123: ${Thread.currentThread().name}")
        }
        threadPool.execute{
            for(i in 1..100000){
                println("Task 5 is running on ${Thread.currentThread().name}")
            }
            println("Task 6 ThreadName123: ${Thread.currentThread().name}")
        }
        threadPool.execute{
            for(i in 1..100000){
                println("Task 5 is running on ${Thread.currentThread().name}")
            }
            println("Task 7 ThreadName123: ${Thread.currentThread().name}")
        }
        threadPool.execute{
            for(i in 1..100000){
                println("Task 8 is running on ${Thread.currentThread().name}")
            }
            println("Task 8 ThreadName123: ${Thread.currentThread().name}")
        }
        threadPool.execute{
            for(i in 1..100000){
                println("Task 8 is running on ${Thread.currentThread().name}")
            }
            println("Task 9 ThreadName123: ${Thread.currentThread().name}")
        }
    }
}