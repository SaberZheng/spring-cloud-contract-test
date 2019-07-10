package com.ecut.test;

import org.jooq.codegen.GenerationTool;

/**
 * @author Amy
 * @date 2019-07-04 16:27
 * @description: 代码生成器主类
 */
public class CodeGenerator {

    public static void main(String[] args) throws Exception {
        GenerationTool.main(new String[]{"/Users/zhengamy/IdeaProjects/spring-cloud-contract-test/spring-cloud-contract-provider/src/main/resources/library.xml"});
    }
}
