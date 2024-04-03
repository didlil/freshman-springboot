<template>
    <form @submit.prevent="registerUser" class="registration-form">
      <div class="form-row">
        <label>氏名:</label>
        <div class="name-group">
          <input v-model="user.lastName" required pattern="[ぁ-んァ-ン一-龠々]+" title="日本語で入力してください" placeholder="姓">
          <input v-model="user.firstName" required pattern="[ぁ-んァ-ン一-龠々]+" title="日本語で入力してください" placeholder="名">
        </div>
      </div>
  
      <div class="form-row">
        <label>かな:</label>
        <div class="kana-group">
          <input v-model="user.sei" required pattern="[ぁ-んー]+" title="日本語で入力してください" placeholder="せい">
          <input v-model="user.mei" required pattern="[ぁ-んー]+" title="日本語で入力してください" placeholder="めい">
        </div>
      </div>
  
      <div class="form-row">
        <label>出生年月日:</label>
        <input v-model="user.birthdate" type="date" required>
      </div>
  
      <div class="form-row">
        <label>性別:</label>
        <div class="gender-group">
          <label><input type="radio" v-model="user.gender" value="male"> 男性</label>
          <label><input type="radio" v-model="user.gender" value="female"> 女性</label>
        </div>
      </div>
  
      <div class="form-row">
        <label>Email:</label>
        <input v-model="user.email" type="email" required>
      </div>
  
      <div class="form-row">
        <label>パスワード:</label>
        <input v-model="user.password" type="password" required pattern="[a-zA-Z0-9!@#$%^&*()_+]{8,}"
               title="半角英数字及び特殊文字(!@#$%^&*()_+)、8文字以上で入力してください">
      </div>
  
      <div class="form-row">
        <label>郵便番号:</label>
        <input v-model="user.postalCode" required pattern="\d{7}" title="7桁の数字を入力してください">
      </div>
  
      <div class="form-row">
        <label>電話番号:</label>
        <input v-model="user.phoneNumber" required pattern="0\d{9,10}" title="0で始まる10桁または11桁の電話番号を入力してください">
      </div>
  
      <div class="form-row">
        <label>都道府県:</label>
        <select v-model="user.prefecture" required>
          <option value="tokyo">東京</option>
          <option value="osaka">大阪</option>
          <option value="kanagawa">神奈川</option>
          <option value="saitama">埼玉</option>
        </select>
      </div>
  
      <div class="form-row">
        <label>住所（郡市区）:</label>
        <input v-model="user.address" required>
      </div>
  
      <div class="form-row">
        <label>建築名称:</label>
        <input v-model="user.buildingName">
      </div>
  
      <button type="submit">Register</button>
    </form>
  </template>
  
  <style>
  .registration-form {
    max-width: 600px;
    margin: auto;
  }
  
  .form-row {
    display: flex;
    align-items: center;
    margin-bottom: 20px;
  }
  
  label {
    flex: 0 0 120px; /* 固定宽度的标签 */
    font-weight: bold;
    margin-right: 10px;
  }
  
  input,
  select {
    flex: 1;
    padding: 8px;
    box-sizing: border-box;
  }
  </style>
  
  <script>
  export default {
    data() {
      return {
        user: {
          lastName: "",
          firstName: "",
          sei: "",
          mei: "",
          email: "",
          password: "",
          postalCode: "",
          phoneNumber: "",
          prefecture: "",
          address: "",
          buildingName: "",
          birthdate: "",
          gender: "",
        },
      };
    },
    methods: {
      registerUser() {
        // 发送用户注册请求
      },
    },
  };
  </script>
  