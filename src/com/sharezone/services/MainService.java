package com.sharezone.services;

import java.util.ArrayList;

import com.sharezone.bean.OrderDetailsBean;
import com.sharezone.bean.RatingBean;
import com.sharezone.bean.SignUpBean;
import com.sharezone.bean.WorkspaceDetailsBean;
import com.sharezone.vo.OrderDetailsVo;
import com.sharezone.vo.WorkspaceVo;

public interface MainService {

	


	String setSignUp(SignUpBean signup);




	String setWorkspaceDetails(WorkspaceDetailsBean workspaceDetails);




	String setlogin(SignUpBean sess);




	ArrayList<WorkspaceVo> getWorkspaceList();




	ArrayList<SignUpBean> getManagerList();




	ArrayList<SignUpBean> getManagers();




	ArrayList<WorkspaceDetailsBean> getWorkspaceListForManager(Integer id);




	String setOrder(OrderDetailsBean obj);




	ArrayList<OrderDetailsVo> getRequestList(Integer managerId);




	String setapproveRequest(String orderId);




	String setrejectRequest(String orderId);




	String setexpireRequest(String ordersId);




	String setrateMe(RatingBean obj);




	ArrayList<RatingBean> getAllReviews(String workspaceid);




	String updateRating(String workspaceid, float avgrating);




	




	









	











}
