package com.example.leesnriud.myansynctask;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * android ansynctask
 * <p>
 * 应用程序(application) 为了完成特定任务，用某种语言编写的一组指令集合（一组静态代码）
 * 进程(process) 运行中的程序，系统调度与资源分配的一个独立单位，操作系统会为每个进程分配一个内存空间，
 * 程序的依次动态执行，经历代码加载 -> 执行 -> 执行完毕的完整过程
 * 线程(thread) 比进程更小的执行单元，每个进程可能有多条线程，线程放在一个进程中才能执行，
 * 线程是由程序负责管理的，而进程是由系统进行调度的
 * 多线程(Multithreading) 并行的执行多条指令，将CPU的时间片按照调度算法，分配给各个线程，
 * 实际上是分时执行的，只是这个切换的时间很短，用户感觉是同时而已
 * 同步和异步 异步无需等待，同步需要等待
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txttitle)
    TextView txttitle;
    @BindView(R.id.pgbar)
    ProgressBar pgbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnupdate)
    public void onViewClicked() {
        MyAsyncTask asyncTask = new MyAsyncTask(txttitle,pgbar);
        asyncTask.execute(1000);
    }
}
