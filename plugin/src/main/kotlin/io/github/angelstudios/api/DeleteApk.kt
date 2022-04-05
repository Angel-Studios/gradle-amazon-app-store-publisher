package io.github.angelstudios.api

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.DELETE
import retrofit2.http.Header
import retrofit2.http.Path

interface DeleteApk {
    @DELETE("{version}/applications/{appId}/edits/{editId}/apks/{apkId}")
    fun deleteApk(
        @Header("Authorization") authorization: String,
        @Header("If-Match") eTag: String,
        @Path("version") version: String,
        @Path("appId") applicationId: String,
        @Path("editId") editId: String,
        @Path("apkId") apkId: String
    ): Call<ResponseBody>
}
