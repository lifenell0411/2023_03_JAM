package com.KoreaIT.example.JAM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<Article> articles = new ArrayList<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("===프로그램 시작===");
		int lastId = 0;
		while (true) {
			System.out.print("명령어 ) ");
			String command = sc.nextLine().trim();

			if (command.equals("article write")) {
				System.out.println("==게시물 작성==");
				int id = lastId + 1;
				System.out.print("제목 : ");
				String title = sc.nextLine();
				System.out.print("내용 : ");
				String body = sc.nextLine();

				Article article = new Article(id, title, body);
				articles.add(article);
				System.out.println(id + "번 글이 생성되었습니다.");
				lastId++;

			} else if (command.equals("article list")) {
				System.out.println("==게시물 목록==");
				if (articles.size() == 0) {
					System.out.println("존재하는 게시물이 없습니다.");
					continue;
				}
				System.out.println("번호  /  제목");

				for (int i = articles.size() - 1; i >= 0; i--) {
					Article article = articles.get(i);

					System.out.println(article.id + "  /  " + article.title);

				}
			} else if (command.equals("exit")) {
				break;
			}
		}
		System.out.println("===프로그램 종료===");
		sc.close();
	}

}
