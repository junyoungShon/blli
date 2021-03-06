package kr.co.blli.model.member;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;

import kr.co.blli.model.vo.BlliBabyVO;
import kr.co.blli.model.vo.BlliMemberScrapeVO;
import kr.co.blli.model.vo.BlliMemberVO;
import kr.co.blli.model.vo.BlliScheduleVO;

public interface MemberService {
	

	public void joinMemberByEmail(BlliMemberVO blliMemberVO);

	public BlliMemberVO findMemberById(BlliMemberVO blliMemberVO);

	public void insertBabyInfo(BlliMemberVO blliMemberVO, HttpServletRequest request) throws Exception;

	public BlliMemberVO selectBlliMemberInfoByMemberId(String memberId);

	public void joinMemberBySNS(BlliMemberVO blliMemberVO);

	public List<BlliBabyVO> selectBabyListByMemberId(String memberId) throws ParseException;

	public void changeRecommendingBaby(BlliBabyVO blliBabyVO);

	public void updateMemberInfoByEmail(BlliMemberVO blliMemberVO);

	public void deleteBabyInfo(BlliMemberVO blliMemberVO);

	
	
	//용호 작성 영역
	public List<BlliMemberVO> getMemberHavingBabyAgeChangedList();
	public List<BlliBabyVO> getBabyAgeChangedListOfMember(String memberId) throws ParseException;
	public void sendLinkToGetTemporaryPassword(String memberEmail) throws UnsupportedEncodingException, MessagingException;
	public String updateMemberPasswordToTemporaryPassword(String memberEmail);
	public void sendTemporaryPasswordMail(String memberEmail, String TemporaryPassword) throws UnsupportedEncodingException, MessagingException;

	public int addSchedule(BlliScheduleVO bsvo);
	public void updateSchedule(BlliScheduleVO bsvo);
	public BlliScheduleVO selectSchedule(BlliScheduleVO bsvo);
	public int denySendEmail(String memberEmail);
	public List<BlliScheduleVO> getMemberScheduleList(String memberId);

	
	
	//현석 작성 영역
	public ArrayList<BlliMemberScrapeVO> getScrapeInfoByMemberId(BlliMemberVO memberVO);

}
