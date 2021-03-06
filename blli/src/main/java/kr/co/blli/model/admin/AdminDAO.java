package kr.co.blli.model.admin;

import java.util.List;

import kr.co.blli.model.vo.BlliMailVO;
import kr.co.blli.model.vo.BlliMemberVO;
import kr.co.blli.model.vo.BlliMidCategoryVO;
import kr.co.blli.model.vo.BlliPostingVO;
import kr.co.blli.model.vo.BlliSmallProductVO;
import kr.co.blli.model.vo.BlliWordCloudVO;

public interface AdminDAO {

	BlliMemberVO findMemberInfoById(String memberId);
	
	BlliMailVO findMailSubjectAndContentByMailForm(String mailForm);
	
	List<BlliPostingVO> unconfirmedPosting(String pageNo);
	
	int totalUnconfirmedPosting();
	
	List<BlliPostingVO> postingListWithSmallProducts(String pageNo);
	
	int totalPostingWithProducts();
	
	List<BlliSmallProductVO> unconfirmedSmallProduct(String pageNo);
	
	int totalUnconfirmedSmallProduct();
	
	void deletePosting(BlliPostingVO vo);
	
	void selectProduct(BlliPostingVO vo);
	
	void deleteProduct(String postingUrl);
	
	int registerPosting(BlliPostingVO vo);
	
	void deleteSmallProduct(String smallProductId);

	void registerSmallProduct(BlliSmallProductVO vo);

	void registerAndUpdateSmallProduct(BlliSmallProductVO vo);

	void updateSmallProductName(BlliSmallProductVO vo);

	void updateMidCategoryWhenToUse(BlliSmallProductVO vo);

	String getMidCategoryId(String smallProductId);

	void updatePostingCount(BlliPostingVO vo);

	List<BlliPostingVO> makingWordCloud(String smallProductId);

	String selectPostingContentByPostingUrl(String postingUrl);

	int updateWordCloud(BlliWordCloudVO blliWordCloudVO);

	void insertWordCloud(BlliWordCloudVO blliWordCloudVO);

	void snsShareCountUp(String smallProductId);

	List<BlliMidCategoryVO> selectAllMidCategory();

	List<BlliSmallProductVO> selectAllSmallProduct();
	List<BlliPostingVO> checkPosting();

	void notAdvertisingPosting(BlliPostingVO postingVO);

	List<BlliMemberVO> checkMember();

	int updateSmallProductStatus(String smallProductId);

	void insertPermanentDeadPosting(BlliPostingVO vo);

	void updatePostingStatusToconfirmed(String smallProductId);

	List<BlliPostingVO> unconfirmedPostingBySearchSmallProduct(String pageNo, String searchWord);

	List<BlliPostingVO> unconfirmedPostingBySearchsmallProductId(String pageNo, String searchWord);

	int totalUnconfirmedPostingBySearchSmallProduct(String searchWord);

	int totalUnconfirmedPostingBySearchSmallProductId(String searchWord);

	BlliSmallProductVO getSmallProductWhenToUse(String midCategoryId);

}
 
