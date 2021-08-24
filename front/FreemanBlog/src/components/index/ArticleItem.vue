<template>
<el-card class="box-shadow">
  <div class="article-header">
    <a href="javascript:void(0);" class="item_title">{{title}}</a>
    <div class="float-right view-comment-block">
      <el-tooltip content="评论数" placement="top" effect="light">
        <span class="icon-size-lg">
          <i class="iconfont icon-size-lg el-icon-comment"></i>&nbsp;{{commentCounts}}
        </span>
      </el-tooltip>
      &nbsp;&nbsp;
      <el-tooltip content="浏览量" placement="top" effect="light">
        <span class="icon-size-lg">
          <i class="el-icon-view"></i>&nbsp;{{viewCounts}}
        </span>
      </el-tooltip>
    </div>
   </div>
  <div class="article-content">
    {{summary}}
  </div>
  <!--author.nickname t.tagname createDate-->
  <div class="article-footer">

    <span class="author-nickname">
      <i class="el-icon-user"></i>&nbsp;{{author.nickname}}
    </span>
    <!-- <el-tag v-for="t in tags" :key="t.tagname" size="mini" type="success">{{t.tagname}}</el-tag> -->
    <tag v-for="t in tags" :key="t" :val="t" class="tags"></tag>
    <span class="float-right create-date">
      <i class="el-icon-time"></i>&nbsp;{{createDate}}
    </span>
  </div>
</el-card>
</template>

<script>
import tag from '../utils/tag.vue'
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
  },
  mounted(){
    //console.log(PRIMARY);
  },
  components:{
    tag
  }
}
</script>

<style scoped>
.tags{
  margin-right:5px;
}
.tags:first-of-type{
  margin-left: 5px;
}
.view-comment-block span:hover{
  cursor: pointer;
  color: #909399;
}
.view-comment-block{
  width: auto;
  /* max-width: 20%; */
}

.article-content,.article-footer{
  margin-top: 9px;
}

.article-content{
  margin-bottom: -3px;
  max-height: 100px;
  overflow: hidden;
  line-height: 1.67;
  font-size: 15px;
  font-weight: 400;
  cursor: pointer;

}

.article-content:hover{
  color: var(--my-hover-dark);
}


.icon-size-lg{
  font-size: 18px;
}

.el-card{
  background: #ffffff;
  color: #121212;
  border-radius: 4px;
  line-height: 1.67;
}


a{
  cursor: pointer;
  text-decoration: none;
  font-size: 18px;
  font-weight: 600;
}

a:link,a:visited{
  color: rgb(18, 18, 18);
}
a:hover{
  color:#175199;
}
.item_title{
  width: auto;
  /*max-width: 80%;*/
  overflow:hidden;
  /* @????? */
  white-space:nowrap;
  text-overflow:ellipsis;
}
.author-nickname{
  display: inline-block;
  font-weight: 500;
  color: var(--author-dark);
  cursor: pointer;

}
.author-nickname:hover{
  color: var(--my-hover-dark);
}
.create-date{
  display: inline-block;
  font-size: 14px;
  cursor: pointer;
  color: #8590a6;
  margin-top:5px;

}
</style>
