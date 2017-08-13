package com.hicetech.ucenter.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateUtil {

	/**
	 *输出两个日期之间所有的月份间隔为1 
	 *
	 * @param minDate
	 * @param maxDate
	 * @return
	 * @throws ParseException
	 */
	public static List<String> getMonthBetween(String minDate, String maxDate) throws ParseException {
		ArrayList<String> result = new ArrayList<String>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");// 格式化为年月

		Calendar min = Calendar.getInstance();
		Calendar max = Calendar.getInstance();

		min.setTime(sdf.parse(minDate));
		min.set(min.get(Calendar.YEAR), min.get(Calendar.MONTH), min.get(Calendar.DATE));

		max.setTime(sdf.parse(maxDate));
		max.set(max.get(Calendar.YEAR), max.get(Calendar.MONTH), min.get(Calendar.DATE));

		Calendar curr = min;
		while (curr.before(max)) {
			result.add(sdf.format(curr.getTime()));
			curr.add(Calendar.MONTH, 1);
		}

		return result;
	}

	/**
	 * 用于计算月龄
	 * @param minDate
	 * @param maxDate
	 * @return
	 */
	public static int getMonths(String minDate, String maxDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		try {
			c.setTime(sdf.parse(maxDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		int year1 = c.get(Calendar.YEAR);
		int month1 = c.get(Calendar.MONTH);

		try {
			c.setTime(sdf.parse(minDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		int year2 = c.get(Calendar.YEAR);
		int month2 = c.get(Calendar.MONTH);

		int result;
		if (year1 == year2) {
			result = month1 - month2;
		} else {
			result = 12 * (year1 - year2) + month1 - month2;
		}
		return result;

	}

	/**
	 * 计算相差天数
	 * @param minDate
	 * @param maxDate
	 * @return
	 * @throws ParseException
	 */
	public static int getDaysBetween(Long minDate, Long maxDate) throws ParseException {

		int restult = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("dd");// 格式化为年月
		int BirthDay = Integer.parseInt(sdf.format(minDate));
		int NowDay = Integer.parseInt(sdf.format(maxDate));
		if (BirthDay == NowDay) {
			return restult;
		} else if (BirthDay < NowDay) {
			restult = NowDay - BirthDay;
		} else if (BirthDay > NowDay) {
			//获取一个月前的时期
			Calendar c = Calendar.getInstance();
			c.setTime(new Date());
			c.add(Calendar.MONTH, -1);
			int last = c.getActualMaximum(Calendar.DAY_OF_MONTH);//获取一个月前的最大天数
			int lastMonth = last - BirthDay;
			if (lastMonth <= 0) {
				restult = NowDay;
			} else {
				restult = lastMonth + NowDay;
			}
		}
		return restult;
	}

	/**
	 * 获得当前是出发还是晚安状态
	 * @return 0-出发状态，1-晚安状态
	 */
	public static Integer getTimeStatus() {
		Integer type = 0;
		Date time = new Date();
		SimpleDateFormat format = new SimpleDateFormat("HH");
		String x = format.format(time);
		int status = Integer.parseInt(x);
		if (status >= 6 && status < 18) {
			type = 0;
		} else {
			type = 1;
		}
		return type;
	}

	/**
	 * 获得当天0点时间戳，单位 S
	 */
	public static Long getToday0() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime().getTime() / 1000;
	}

	/**
	 * 获得当天23点59分59秒时间戳，单位 S
	 */
	public static Long getToday24() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime().getTime() / 1000;
	}

	/**
	 * 获得当天6点时间戳，单位 S
	 */
	public static Long getToday6() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 6);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime().getTime() / 1000;
	}

	/**
	 * 获得当天9点时间戳，单位 S
	 */
	public static Long getToday9() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 9);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime().getTime() / 1000;
	}

	/**
	 * 获得当天18点时间戳，单位 S
	 */
	public static Long getToday18() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 18);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime().getTime() / 1000;
	}

	/**
	 * 获得当天21点时间戳，单位 S
	 */
	public static Long getToday21() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 21);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime().getTime() / 1000;
	}

	/**
	 * 获得当天23点时间戳，单位 S
	 */
	public static Long getToday23() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime().getTime() / 1000;
	}

	/*
	 * // 获得昨天0点时间 public static Date getYesterdaymorning() { Calendar cal =
	 * Calendar.getInstance(); cal.setTimeInMillis(getTimesmorning().getTime() -
	 * 3600 * 24 * 1000); return cal.getTime(); }
	 * 
	 * // 获得当天近7天时间 public static Date getWeekFromNow() { Calendar cal =
	 * Calendar.getInstance(); cal.setTimeInMillis(getTimesmorning().getTime() -
	 * 3600 * 24 * 1000 * 7); return cal.getTime(); }
	 * 
	 * // 获得当天24点时间 public static Date getTimesnight() { Calendar cal =
	 * Calendar.getInstance(); cal.set(Calendar.HOUR_OF_DAY, 24);
	 * cal.set(Calendar.SECOND, 0); cal.set(Calendar.MINUTE, 0);
	 * cal.set(Calendar.MILLISECOND, 0); return cal.getTime(); }
	 * 
	 * // 获得本周一0点时间 public static Date getTimesWeekmorning() { Calendar cal =
	 * Calendar.getInstance(); cal.set(cal.get(Calendar.YEAR),
	 * cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
	 * cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY); return cal.getTime(); }
	 * 
	 * // 获得本周日24点时间 public static Date getTimesWeeknight() { Calendar cal =
	 * Calendar.getInstance(); cal.setTime(getTimesWeekmorning());
	 * cal.add(Calendar.DAY_OF_WEEK, 7); return cal.getTime(); }
	 * 
	 * // 获得本月第一天0点时间 public static Date getTimesMonthmorning() { Calendar cal =
	 * Calendar.getInstance(); cal.set(cal.get(Calendar.YEAR),
	 * cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
	 * cal.set(Calendar.DAY_OF_MONTH,
	 * cal.getActualMinimum(Calendar.DAY_OF_MONTH)); return cal.getTime(); }
	 * 
	 * // 获得本月最后一天24点时间 public static Date getTimesMonthnight() { Calendar cal =
	 * Calendar.getInstance(); cal.set(cal.get(Calendar.YEAR),
	 * cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
	 * cal.set(Calendar.DAY_OF_MONTH,
	 * cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	 * cal.set(Calendar.HOUR_OF_DAY, 24); return cal.getTime(); }
	 * 
	 * public static Date getLastMonthStartMorning() { Calendar cal =
	 * Calendar.getInstance(); cal.setTime(getTimesMonthmorning());
	 * cal.add(Calendar.MONTH, -1); return cal.getTime(); }
	 * 
	 * public static Date getCurrentQuarterStartTime() { Calendar c =
	 * Calendar.getInstance(); int currentMonth = c.get(Calendar.MONTH) + 1;
	 * SimpleDateFormat longSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 * SimpleDateFormat shortSdf = new SimpleDateFormat("yyyy-MM-dd"); Date now
	 * = null; try { if (currentMonth >= 1 && currentMonth <= 3)
	 * c.set(Calendar.MONTH, 0); else if (currentMonth >= 4 && currentMonth <=
	 * 6) c.set(Calendar.MONTH, 3); else if (currentMonth >= 7 && currentMonth
	 * <= 9) c.set(Calendar.MONTH, 4); else if (currentMonth >= 10 &&
	 * currentMonth <= 12) c.set(Calendar.MONTH, 9); c.set(Calendar.DATE, 1);
	 * now = longSdf.parse(shortSdf.format(c.getTime()) + " 00:00:00"); } catch
	 * (Exception e) { e.printStackTrace(); } return now; }
	 * 
	 * // 当前季度的结束时间，即2012-03-31 23:59:59 public static Date
	 * getCurrentQuarterEndTime() { Calendar cal = Calendar.getInstance();
	 * cal.setTime(getCurrentQuarterStartTime()); cal.add(Calendar.MONTH, 3);
	 * return cal.getTime(); }
	 * 
	 * public static Date getCurrentYearStartTime() { Calendar cal =
	 * Calendar.getInstance(); cal.set(cal.get(Calendar.YEAR),
	 * cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
	 * cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.YEAR));
	 * return cal.getTime(); }
	 * 
	 * public static Date getCurrentYearEndTime() { Calendar cal =
	 * Calendar.getInstance(); cal.setTime(getCurrentYearStartTime());
	 * cal.add(Calendar.YEAR, 1); return cal.getTime(); }
	 * 
	 * public static Date getLastYearStartTime() { Calendar cal =
	 * Calendar.getInstance(); cal.setTime(getCurrentYearStartTime());
	 * cal.add(Calendar.YEAR, -1); return cal.getTime(); }
	 */
	public static void main(String[] args) {
		System.out.println("当天0点时间：" + getToday0());
		System.out.println("当天23:59:59时间：" + getToday24());
	}
}
