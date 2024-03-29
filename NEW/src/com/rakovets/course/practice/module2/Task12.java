package com.rakovets.course.practice.module2;

import java.text.DecimalFormat;

/**
 * Разработать программу для игрового движка:
 * которая высчитывает сколько времени пользователь провел в игре, если известно
 *
 * @param playingTimeInSeconds - количество секунд проведенных пользователем в игре
 *
 * @return время в формате 'D H:m:s', где D - дни, H - часы, m - минуты, s - секунды
 */
public class Task12 {
	public static void main(String[] args) {
		//FIXME
		// Переменные, которые можно изменять для проверки различных вариантов входных параметров
		int playingTimeInSeconds = 95000;

		// Код необходимый для тестирования, не изменять
		playingTimeInSeconds = (args.length == 1) ? Integer.valueOf(args[0]) : playingTimeInSeconds;

		//TODO
		// Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		int days;
		days = playingTimeInSeconds / (24 * 60 * 60);
//		System.out.println(days);
		int hours;
		hours = (playingTimeInSeconds - (days * 24 * 60 * 60)) / (60 * 60);
//		System.out.println(hours);
		int minutes;
		minutes = (playingTimeInSeconds - (days * 24 * 60 * 60) - (hours * 60 * 60)) / 60;
//		System.out.println(minutes);
		int seconds;
		seconds = (playingTimeInSeconds - (days * 24 * 60 * 60) - (hours * 60 * 60) ) % 60;
//		System.out.println(seconds);

		System.out.println(days + " " + hours + ":" + minutes + ":" + seconds);
	}
}