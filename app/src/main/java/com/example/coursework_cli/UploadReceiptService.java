package com.example.coursework_cli;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface UploadReceiptService {
    @Multipart
    @POST("/coursework/upload_file.php")
    Call<ResponseBody> uploadReceipt(
            @Part MultipartBody.Part file
    );
}
