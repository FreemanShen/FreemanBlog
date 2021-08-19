<template>
<el-card>
  <div class="article-header">
    <a href="javascript:void(0);">{{title}}</a>
    <el-button type="text">置顶</el-button>
    <span>
      <i class="el-icon-comment"></i>&nbsp;{{commentCounts}}
    </span>
    <span>
      <i class="el-icon-view"></i>&nbsp;{{viewCounts}}
    </span>

  </div>
  <div class="article-content">
    {{summary}}
  </div>
  <div class="article-footer">
    <span class="me-article-author">
      <i class="me-icon-author"></i>&nbsp;{{author.nickname}}
    </span>

    <!-- <el-tag v-for="t in tags" :key="t.tagname" size="mini" type="success">{{t.tagname}}</el-tag> -->

    <span class="me-pull-right me-article-count">
      <i class="el-icon-time"></i>&nbsp;{{createDate | format}}
    </span>
  </div>


</el-card>
</template>

<script>
export default{
  name:'ArticleItem',
  props:{
    id:Number,
    weight:Number,
    title:String,
    commentCounts:Number,
    viewCounts:Number,
    summary:String,
    author:Object,
    tags:Array,
    createDate:String
  }
}
</script>

<style scoped>

</style>
