package com.ayushi.model;


import java.sql.Date;

public class Order {
		int orderId;
		String uid;
		String date;
		String address;
		int status;
		int iid;
		int quantuty;
		int netAmount;
		public String getUid() {
			return uid;
		}
		public void setUid(String uid) {
			this.uid = uid;
		}
		public int getIid() {
			return iid;
		}
		public void setIid(int iid) {
			this.iid = iid;
		}
		public int getQuantuty() {
			return quantuty;
		}
		public void setQuantuty(int quantuty) {
			this.quantuty = quantuty;
		}
		public int getNetAmount() {
			return netAmount;
		}
		public void setNetAmount(int netAmount) {
			this.netAmount = netAmount;
		}
		public int getOrderId() {
			return orderId;
		}
		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}
		public String getuid() {
			return uid;
		}
		public void setUserId(String userId) {
			this.uid = userId;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getStatus()
		{
			return this.status;
		}
		public void setStatus(int status)
		{
			this.status=status;
		}
		
}
