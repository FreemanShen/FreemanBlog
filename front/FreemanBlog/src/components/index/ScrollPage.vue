<template>
<div ref="scroll" id="scroll-page" style="overflow:hidden">
  <slot></slot>
  <div
    style="height: 40px;margin-top: 10px;z-index: 1"
    v-loading="loading"
    element-loading-text="拼命加载中"
    element-loading-spinner="el-icon-loading"
    element-loading-background="rgb(255,255,255)"
  ></div>
</div>
</template>
<script>
export default{
  name:'ScrollPage',
  props:{
    loading:Boolean,
    noData:Boolean,
  },
  watch:{
    noData:(newVal,oldVal)=>{
      if(newVal==false){
        this.loading = false;
      }else{
        this.loading = true;
      }
    }
  }
}
</script>
