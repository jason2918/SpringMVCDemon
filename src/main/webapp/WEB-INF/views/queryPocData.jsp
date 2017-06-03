<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>

<div id="page-wrapper" style="min-height: 550px;">
	
	<div class="row">
      <div class="col-lg-12">
        <section class="panel panel-info">
            <header class="panel-heading">
                查询条件
                <span class="tools pull-right">
                    <a href="javascript:;" class="fa fa-chevron-down"></a>
                </span>
            </header>
            <div class="panel-body">
                <form class="form-inline" role="form" method="post" onsubmit="return toQueryData();">
                    <div class="form-group">
                        <label for="scheduledSellingIds">采购档期ID：</label>
                        <input type="text" autocomplete="off" class="form-control" id="scheduledSellingIds"
                               style="width: 200px;" placeholder="用空格或逗号分隔各个ID" required>
                    </div>
                    
                    <div class="form-group">
                        <label for="scheduledSellingIds">POCSKUID：</label>
                        <input type="text" autocomplete="off" class="form-control" id="scheduledSellingIds"
                               style="width: 200px;" placeholder="用空格或逗号分隔各个ID" required>
                    </div>
                    
                    <div class="form-group">
                        <label for="scheduledSellingIds">商品条码：</label>
                        <input type="text" autocomplete="off" class="form-control" id="scheduledSellingIds"
                               style="width: 200px;" placeholder="用空格或逗号分隔各个ID" required>
                    </div>
                    
                    <button type="button" id="scheduledSellingIdsSubmit" class="btn btn-success">查询</button>
                    <button type="reset" class="btn btn-info">重置</button>
                </form>
            </div>
        </section>
      </div>
	</div>

	<div class="row">
    <div class="col-sm-12">
        <section class="panel panel-info">
            <header class="panel-heading">
                查询结果
                <span class="tools pull-right">
                    <a href="javascript:;" class="fa fa-chevron-down"></a>
                </span>
            </header>
            <div class="panel-body">
                <div class="adv-table">
                    <table class="display table table-bordered table-striped" id="dynamic-table">
                        <thead>
                        <tr>
                            <th>采购档期ID</th>
                            <th>采购档期组ID</th>
                            <th>分仓</th>
                            <th>销售模式</th>
                            <th>库存占用方式</th>
                            <th>供应商编码</th>
                            <th>销售开始时间</th>
                            <th>销售结束时间</th>
                            <th>采购档期状态</th>
                            <th>是否删除标识</th>
                            <th>创建人</th>
                        </tr>
                        </thead>
                        <tbody></tbody>
                    </table>
                </div>
            </div>
        </section>
    </div>
</div>
	
</div>

</div>