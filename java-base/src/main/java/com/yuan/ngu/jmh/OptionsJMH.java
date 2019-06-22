package com.yuan.ngu.jmh;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class OptionsJMH {

    //声明这个方法为一个微基准测试方法
    @Benchmark
    public void m() {

    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include("OptionsJMH")
                .exclude("Pref")
                //预热做10轮
                .warmupIterations(10)
                //正式计量测试做10轮，
                .measurementIterations(10)
                //做3轮测试
                .forks(3)
                .build();
        new Runner(opt).run();
    }
}
