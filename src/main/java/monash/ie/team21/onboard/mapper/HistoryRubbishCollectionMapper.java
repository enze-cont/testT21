package monash.ie.team21.onboard.mapper;

import java.util.List;
import monash.ie.team21.onboard.entity.HistoryRubbishCollection;
import monash.ie.team21.onboard.entity.HistoryRubbishCollectionExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HistoryRubbishCollectionMapper {
    int countByExample(HistoryRubbishCollectionExample example);

    int deleteByExample(HistoryRubbishCollectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HistoryRubbishCollection record);

    int insertSelective(HistoryRubbishCollection record);

    List<HistoryRubbishCollection> selectByExample(HistoryRubbishCollectionExample example);

    HistoryRubbishCollection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HistoryRubbishCollection record, @Param("example") HistoryRubbishCollectionExample example);

    int updateByExample(@Param("record") HistoryRubbishCollection record, @Param("example") HistoryRubbishCollectionExample example);

    int updateByPrimaryKeySelective(HistoryRubbishCollection record);

    int updateByPrimaryKey(HistoryRubbishCollection record);
}