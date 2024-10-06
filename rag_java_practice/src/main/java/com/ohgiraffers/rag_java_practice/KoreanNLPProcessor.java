package com.ohgiraffers.rag_java_practice;

import kr.bydelta.koala.okt.SentenceSplitter;

import java.util.List;

public class KoreanNLPProcessor {
    public static void main(String[] args) {

        SentenceSplitter splitter = new SentenceSplitter();
        List<String> paragraph = splitter.sentences("정말 재미있어요. 인테리어 최고!");

        for (int i = 0; i < paragraph.size(); i++) {
            System.out.println(paragraph.get(i));
        }
    }

}
