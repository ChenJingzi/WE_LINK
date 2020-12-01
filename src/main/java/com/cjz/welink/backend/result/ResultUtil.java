package com.cjz.welink.backend.result;

public class ResultUtil {

        public static Result success(Object object) {
            Result result = new Result();
            result.setCode(200);
            result.setMsg("Success");
            result.setData(object);
            return result;
        }

        public static Result success() {
            return success(null);
        }

        public static Result error(Integer code, String resultmsg) {
            Result result = new Result();
            result.setCode(code);
            result.setMsg(resultmsg);
            return result;
        }

    }

