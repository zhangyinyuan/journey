package com.yuan.ngu.jmh;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class AnnotationJMH {


    //预热2轮 正式计量1轮
    //@Fork(value = 1, warmups = 2)
//    @BenchmarkMode(Mode.Throughput)
    @Benchmark
    public void init() {
//        Benchmark      Mode  Cnt           Score           Error  Units
//        OptionsJMH.m  thrpt   30  2043789613.006 ± 229731245.174  ops/s
//        for (int i = 0; i < 1_000_000; i++) {
//
//        }
//        Benchmark      Mode  Cnt           Score           Error  Units
//        OptionsJMH.m  thrpt   30  2350872669.329 ± 411279998.915  ops/s
        for (int i = 1_000_000; i > 0 ; i--) {

        }
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
//                .include("Perf")
                .exclude("AnnotationJMH")
                .warmupIterations(10)
                .measurementIterations(10)
                .forks(3)
                .build();
        new Runner(opt).run();
    }
}
