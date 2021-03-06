/*
 * Copyright (C) 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.cloud.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author <a href="mailto:fangjian0423@gmail.com">Jim</a>
 */
@EnableBinding(Sink.class)
@SpringBootApplication
public class SinkApplication {

    private static Logger logger = LoggerFactory.getLogger(SinkApplication.class);

    @StreamListener("input")
    public void loggerSink(String date) {
        logger.info("Received: " + date);
    }

    public static void main(String[] args) {
        SpringApplication.run(SinkApplication.class, args);
    }
}
