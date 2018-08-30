package com.example.micro.microserviceexample.utils;

public class SnowFlakeGenerator {

    //snowflake use 64bit to generate globalize id
    //the 1st bit is useless, 2~42 bit is timestamp, 43~52 (10bit) is worker id, 53~64 (12bit) is sequence number


    private static final long initial_time_stamp = 1483200000000L;

    private static final long worker_id_bits = 5L;

    private static final long dc_id_bits = 5L;

    private static final long max_worker_id = ~(-1L<<worker_id_bits);

    private static final long max_dc_id = ~(-1<<dc_id_bits);

    private static final long sequence_bits = 12L;

    private static final long worker_id_offset = sequence_bits;



}
