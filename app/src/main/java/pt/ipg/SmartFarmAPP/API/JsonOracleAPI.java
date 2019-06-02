package pt.ipg.SmartFarmAPP.API;

import java.util.List;

import pt.ipg.SmartFarmAPP.Model.NodeModel;
import pt.ipg.SmartFarmAPP.Model.Value;
import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonOracleAPI {

    @GET("nodes")
    Call<List<Value>> getValues();

    @GET("nodes")
    Call<NodeModel.MyNodes> getNodes();
}
