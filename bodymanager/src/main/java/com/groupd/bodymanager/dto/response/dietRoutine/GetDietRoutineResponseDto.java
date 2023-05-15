package com.groupd.bodymanager.dto.response.dietRoutine;

import java.util.ArrayList;
import java.util.List;

import com.groupd.bodymanager.dto.response.ResponseDto;
import com.groupd.bodymanager.entity.MenuDetailEntity;

import com.groupd.bodymanager.entity.MenuEntity;
import com.groupd.bodymanager.entity.UserMenuSelect;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 손좀 봐야함.
public class GetDietRoutineResponseDto extends ResponseDto{
    private int userCode;
    private String menuCode;
    private String menuName;
    
   

    public GetDietRoutineResponseDto(
        MenuEntity menuEntity,
       UserMenuSelect userMenuSelect) {
            this.userCode = userMenuSelect.getUserCode();
            this.menuCode = menuEntity.getMenuCode();
            this.menuName = menuEntity.getMenuName();

    }

// }

// @Getter
// @Setter
// @AllArgsConstructor
// @NoArgsConstructor
// class Diet {

//     private int dietNumber;
//     private String day;

//     Diet(DietEntity dietEntity) {
//         this.dietNumber = dietEntity.getDietNumber();
//         this.day = dietEntity.getDay();
//     }


// }




// class DietDetail {


//     private String time;
//     private String item;
//     private int dietDetailNumber;

//     DietDetail(DietDetailEntity dietDetailEntity) {
//         this.time = dietDetailEntity.getTime();
//         this.item = dietDetailEntity.getItem();
//         this.dietDetailNumber = dietDetailEntity.getDietDetailNumber();


//     }

    



}


// 