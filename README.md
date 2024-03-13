# OnlyTV

[English](./README_EN.md)


## 介绍



为Android TV设计的全方位影视应用，涵盖直播、短视频、电影和电视剧等丰富资源，提供全面的娱乐体验。



## 体验

[下载链接](https://ludoven.github.io/OnlyTV-Library/OnlyTV-1.0.0.apk)

[库](https://github.com/ludoven/OnlyTV-Library)

简单的做了一个可正常体验的版本,还有很多细节功能没有优化开发，后续有时间逐步完善。（仅供TV开发学习）

###### 特点：



- 复杂页面对焦点的控制，防丢焦的处理
- 对按键的控制以及适配键盘按键操作
- 简洁美观的界面
- RecyclerView TV端纵向横向对焦点、滑动速度、性能封装优化
- 封装播放器，适配 Media3



###### 待开发功能：



- 投屏
- Media3 ExoPlayer ExoPlayer 后续全部迁移至Media3
- TVBox
- IPTV
- 适配键盘操作



## 截图



#### 首页



![img](https://github.com/ludoven/OnlyTV-For-TV/assets/34389786/890a666b-a015-4953-9948-9bbefeaac43d)



#### 详情



![img](https://github.com/ludoven/OnlyTV-For-TV/assets/34389786/19e098b5-9380-4590-8fa3-69d2dd8e4e8c)



#### 分类



![img](https://github.com/ludoven/OnlyTV-For-TV/assets/34389786/0580722c-cafe-4970-9e62-47a84fd16a50)



#### 电影



![img](https://github.com/ludoven/OnlyTV-For-TV/assets/34389786/f4ef6857-0f2e-4d06-8924-38783666732a)



#### 收藏



![img](https://github.com/ludoven/OnlyTV-For-TV/assets/34389786/adbffd76-7d24-4771-9c81-89e6c98ddf69)



#### 搜索



![img](https://github.com/ludoven/OnlyTV-For-TV/assets/34389786/803ae98a-c035-47b4-b6a7-e077bc7e602b)



#### 设置



![img](https://github.com/ludoven/OnlyTV-For-TV/assets/34389786/55105ffb-5bac-4583-abe4-b17b5dca173c)



### 未采用Google Leanback 开发Android TV 应用



1. **灵活性受限：** Leanback库提供了一些预置的 UI 组件和模板，这使得在一些特殊情况下可能会受到一定的限制。如果你对用户界面有非常特殊的设计需求，可能需要更多的自定义工作。
2. **学习曲线：** 对于初次使用Leanback库的开发者来说，可能需要一些时间来熟悉其工作方式和组件。这对于已经熟悉其他Android开发领域的开发者可能需要适应。
3. **不适用于所有应用：** Leanback库主要设计用于大屏幕设备，特别是电视。如果你的应用主要面向其他类型的设备，可能不需要Leanback库提供的大屏幕优化。
4. **库的大小：** 引入Leanback库可能会增加应用的大小，这对于一些要求极小安装包的场景可能是一个考虑因素。
5. **有时过于简化：** 在某些情况下，Leanback库的过度简化可能导致开发者难以实现一些高度定制化的功能。这可能需要更多的自定义工作，甚至可能需要避开Leanback库。
