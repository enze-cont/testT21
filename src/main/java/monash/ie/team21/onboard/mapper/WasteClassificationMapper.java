package monash.ie.team21.onboard.mapper;

import java.util.List;
import monash.ie.team21.onboard.entity.WasteClassification;
import monash.ie.team21.onboard.entity.WasteClassificationExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WasteClassificationMapper {
    int countByExample(WasteClassificationExample example);

    int deleteByExample(WasteClassificationExample example);

    int deleteByPrimaryKey(Integer wasteId);

    int insert(WasteClassification record);

    int insertSelective(WasteClassification record);

    List<WasteClassification> selectByExample(WasteClassificationExample example);

    WasteClassification selectByPrimaryKey(Integer wasteId);

    int updateByExampleSelective(@Param("record") WasteClassification record, @Param("example") WasteClassificationExample example);

    int updateByExample(@Param("record") WasteClassification record, @Param("example") WasteClassificationExample example);

    int updateByPrimaryKeySelective(WasteClassification record);

    int updateByPrimaryKey(WasteClassification record);
}